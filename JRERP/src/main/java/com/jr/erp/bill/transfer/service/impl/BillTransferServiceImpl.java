package com.jr.erp.bill.transfer.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.exception.ServiceAccessException;
import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.service.impl.IFileUploadService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.NumberUtils;
import com.jr.erp.bill.purchase.entity.BillPurchaseItemExample;
import com.jr.erp.bill.transfer.entity.BillTransfer;
import com.jr.erp.bill.transfer.entity.BillTransferExample;
import com.jr.erp.bill.transfer.entity.BillTransferItem;
import com.jr.erp.bill.transfer.entity.BillTransferItemExample;
import com.jr.erp.bill.transfer.service.IBillTransferItemService;
import com.jr.erp.bill.transfer.service.IBillTransferService;
import com.jr.erp.bill.utils.Constance;
import com.jr.erp.bus.stock.entity.ProductStock;
import com.jr.erp.bus.stock.service.IProductStockService;
import com.jr.erp.sys.set.base.entity.Param;
import com.jr.erp.sys.set.base.service.IParamService;
import com.jr.erp.sys.set.purchase.service.IPurchaseSechemeService;

@Service(value="billTransferService")
public class BillTransferServiceImpl extends AbstractBaseService<BillTransfer> implements IBillTransferService
{

    @Autowired
    private  IBillTransferItemService billTransferItemService;
    
    @Autowired
    IPurchaseSechemeService sysPurchaseSechemeService;
    
    @Autowired
    IFileUploadService fileUploadService;
    
    @Autowired
    IParamService paramService;
    
    @Autowired
    IProductStockService productStockService;

    @Override
    public void saveBillAudit(BillTransfer billTransfer)
    {
        // 参数校验
        if (billTransfer.getId() == null)
        {
            throw new ServiceAccessException("单号为空，不能保存，请刷新重试");
        }
        // 检查单据是否存在，并检查是不是本公司的
        boolean exist = this.getBillExist("bill_transfer", billTransfer.getCompanyNo(), billTransfer.getId());
        if (!exist)
        {
            throw new ServiceAccessException("您要保存的单据不存在，或无权操作，请刷新重试");
        }
        // 检查单据状态
        String statusString = this.getBillCanEdit("bill_purchase", billTransfer.getCompanyNo(), billTransfer.getId());
        if (StringUtils.isNotEmpty(statusString))
        {
            throw new ServiceAccessException(statusString);
        }
        Param isAransit = paramService.getParam(billTransfer.getCompanyNo(), billTransfer.getAreaCode(), "transfer","isAransit");
        Param isAudit = paramService.getParam(billTransfer.getCompanyNo(), billTransfer.getAreaCode(), "transfer","isAudit");

        BillPurchaseItemExample itemExample = new BillPurchaseItemExample();
        itemExample.createCriteria().andCompanyNoEqualTo(billTransfer.getCompanyNo())
                .andBillIdEqualTo(billTransfer.getId());
        List<BillTransferItem> itemList = (List) billTransferItemService.selectByExample(itemExample);

        //同步单据信息到明细中
        // 修改明细中的信息，与主单一致
        BillTransferItemExample example = new BillTransferItemExample();
        example.createCriteria().andCompanyNoEqualTo(billTransfer.getCompanyNo()).andBillIdEqualTo(billTransfer.getId());
        BillTransferItem recordTpl = new BillTransferItem();
        recordTpl.setAreaCode(billTransfer.getAreaCode());
        recordTpl.setAreaName(billTransfer.getAreaName());
        recordTpl.setCounterAreaCode(billTransfer.getCounterAreaCode());
        recordTpl.setCounterAreaName(billTransfer.getCounterAreaName());
        recordTpl.setCompanyNo(billTransfer.getCompanyNo());
        recordTpl.setBillDate(billTransfer.getBillDate());
        recordTpl.setBillNo(billTransfer.getBillNo());
        recordTpl.setSysBillNo(billTransfer.getSysBillNo());
        recordTpl.setEmployeeId(billTransfer.getEmployeeId());
        recordTpl.setEmployeeName(billTransfer.getEmployeeName());
        recordTpl.setCreateUserId(billTransfer.getCreateUserId());
        recordTpl.setCreateUserName(billTransfer.getCreateUserName());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("record", recordTpl);
        map.put("example", example);
        billTransferItemService.updateByExampleSelective(map);
        // 修改单据状态
        if (StringUtils.equals(isAransit.getParamValue(), "1"))
        {
            // 需要审核
            billTransfer.setBillStatus(Constance.BILL_STATUS_AUDIT_WAIT);
            processBillAndItem(billTransfer, itemList);
            this.updateByPrimaryKeySelective(billTransfer);
          
        } else
        {
            // 不需要审核
            // 进入在途仓库
            if (StringUtils.equals(isAudit.getParamValue(), "1"))
            {
                billTransfer.setBillStatus(Constance.BILL_STATUS_ONWAY_WAIT);
                processBillAndItem(billTransfer, itemList);
                this.updateByPrimaryKeySelective(billTransfer);
                String counterCode = billTransfer.getAreaCode() + "000";
                productStockService.addPurchaseStock(billTransfer, counterCode);
            } else
            {
                // 需要审核
                billTransfer.setBillStatus(Constance.BILL_STATUS_FINISH);
                processBillAndItem(billTransfer, itemList);
                this.updateByPrimaryKeySelective(billTransfer);
                productStockService.addPurchaseStock(billTransfer, billTransfer.getInCounterAreaCode());
            }

        }

        this.updateByPrimaryKey(billTransfer);
    }

    @Override
    public Map<String, Object> getDesktopBill()
    {
        BillTransferExample example = new BillTransferExample();
        example.setOrderByClause(" billStatus, billDate");
        example.createCriteria().andCompanyNoEqualTo(ShiroUtils.getCompanyNo()) .andCreateUserIdEqualTo(ShiroUtils.getUserId()).andBillStatusIn(Arrays.asList(new Integer[]{0, 10, 15, 20, 25 }));
        List<BillTransfer> billList = (List) this.selectByExample(example);
        Map<String,Object> map = new HashMap<String,Object>();
        List<BillTransfer> noSave = new ArrayList<BillTransfer>();
        List<BillTransfer> waiting = new ArrayList<BillTransfer>();
        List<BillTransfer> reject = new ArrayList<BillTransfer>();
        for (BillTransfer billPurchase : billList)
        {
            switch (billPurchase.getBillStatus())
            {
            case Constance.BILL_STATUS_NEW:
                noSave.add(billPurchase);
                break;
            case Constance.BILL_STATUS_AUDIT_WAIT:
            case Constance.BILL_STATUS_ONWAY_WAIT:
                waiting.add(billPurchase);
                break;
            case Constance.BILL_STATUS_AUDIT_REJECT:
            case Constance.BILL_STATUS_ONWAY_REJECT:
                reject.add(billPurchase);
                break;
            default:
                break;
            }
        }
        
        map.put("noSave", noSave);
        map.put("waiting", waiting);
        map.put("reject", reject);
        map.put("totalNum", billList.size());
        return map;
    }

    @Override
    public BillTransfer getBillWithItem(Integer id)
    {
        BillTransfer billPurchase = (BillTransfer) this.selectByPrimaryKey(id);
        BillTransferItemExample example = new BillTransferItemExample();
        example.createCriteria().andCompanyNoEqualTo(billPurchase.getCompanyNo()).andBillIdEqualTo(billPurchase.getId());
        List<BillTransferItem> itemList = (List)billTransferItemService.selectByExample(example);
        billPurchase.setItemList(itemList);
        return billPurchase;
    }
    
    private void processBillAndItem(BillTransfer billPurchase,List<BillTransferItem> itemList)
    {
        for (BillTransferItem tmp : itemList)
        {
            tmp.setAreaCode(billPurchase.getAreaCode());
            tmp.setAreaName(billPurchase.getAreaName());
            tmp.setCounterAreaCode(billPurchase.getCounterAreaCode());
            tmp.setCounterAreaName(billPurchase.getCounterAreaName());
            tmp.setCompanyNo(billPurchase.getCompanyNo());
            tmp.setBillDate(billPurchase.getBillDate());
            tmp.setBillNo(billPurchase.getBillNo());
            tmp.setSysBillNo(billPurchase.getSysBillNo());
            tmp.setEmployeeId(billPurchase.getEmployeeId());
            tmp.setEmployeeName(billPurchase.getEmployeeName());
            tmp.setCreateUserId(billPurchase.getCreateUserId());
            tmp.setCreateUserName(billPurchase.getCreateUserName());
            
            billPurchase.setTotalMJewelWeight(NumberUtils.toDouble(tmp.getmJewelWeight())+NumberUtils.toDouble(billPurchase.getTotalMJewelWeight()));
            billPurchase.setTotalCost(NumberUtils.toDouble(tmp.getCostPrice())+NumberUtils.toDouble(billPurchase.getTotalCost()));
            billPurchase.setTotalLabelPrice(NumberUtils.toDouble(tmp.getLabelPriceSum())+NumberUtils.toDouble(billPurchase.getTotalLabelPrice()));
            billPurchase.setTotalNum(NumberUtils.toInt(tmp.getNum())+NumberUtils.toInt(billPurchase.getTotalNum()));
            billPurchase.setTotalWorkFee(NumberUtils.toDouble(tmp.getWorkFeeSum())+NumberUtils.toDouble(billPurchase.getTotalWorkFee()));
            billPurchase.setItemList(itemList);
        }
    }

    @Override
    public BillTransfer addTransferItemBatch(BillTransfer billTransfer,String querySql)
    {
        if (StringUtils.isNotEmpty(querySql))
        {
            billTransfer.setBillStatus(Constance.BILL_STATUS_NEW);
            billTransfer.setCreateUserId(ShiroUtils.getUserId());
            billTransfer.setCreateUserName(ShiroUtils.getUserName());
            insert(billTransfer);
            String prefixSql = " companyNo = '" + billTransfer.getCompanyNo() + "' and areaCode = '"+ billTransfer.getAreaCode() + "' and counterAreaCode = '" + billTransfer.getCounterAreaCode()
                    + "' and hasStock = 1 and " +querySql;
            List<ProductStock> stockList = productStockService.queryStockByQueryBuilder(prefixSql);
            if (CollectionUtils.isNotEmpty(stockList))
            {
                for (ProductStock productStock : stockList)
                {
                    BillTransferItem item = new BillTransferItem();
                    item.setBillId(billTransfer.getId());
                    BeanUtils.copyProperties(productStock, item);
                    item.setId(null);
                    item.setOutNum(item.getNum());
                    item.setOutCostPrice(item.getCostPrice());
                    item.setOutGoldWeight(item.getGoldWeight());
                    item.setOutLabelPriceSum(item.getLabelPriceSum());
                    item.setOutMJewelWeight(item.getmJewelWeight());
                    billTransferItemService.insert(item);
                }
            }
        }
        return this.getBillWithItem(billTransfer.getId());
    }

    @Override
    public BillTransfer addByStockId(BillTransfer billTransfer, Integer stockId)
    {
        if (billTransfer.getId() == null)
        {
            billTransfer.setCompanyNo(ShiroUtils.getCompanyNo());
            billTransfer.setBillStatus(Constance.BILL_STATUS_NEW);
            billTransfer.setCreateUserId(ShiroUtils.getUserId());
            billTransfer.setCreateUserName(ShiroUtils.getSysUser().getRealName());
            this.insert(billTransfer);
        } else
        {
         // 检查单据状态
            String statusString = this.getBillCanEdit("bill_transfer", ShiroUtils.getCompanyNo(), billTransfer.getId());
            if (StringUtils.isNotEmpty(statusString))
            {
                throw new ServiceAccessException(statusString);
            }
//            this.updateByPrimaryKey(billTransfer);
        }
        ProductStock productStock = (ProductStock) productStockService.selectByPrimaryKey(stockId);
        BillTransferItem item = new BillTransferItem();
        item.setBillId(billTransfer.getId());
        BeanUtils.copyProperties(productStock, item);
        item.setId(null);
        item.setBillId(billTransfer.getId());
        item.setSysBillNo(billTransfer.getSysBillNo());
        item.setBillNo(billTransfer.getBillNo());
        item.setOutNum(item.getNum());
        item.setOutCostPrice(item.getCostPrice());
        item.setOutGoldWeight(item.getGoldWeight());
        item.setOutLabelPriceSum(item.getLabelPriceSum());
        item.setOutMJewelWeight(item.getmJewelWeight());
        billTransferItemService.insert(item);
        BillTransfer newBillTransfer = (BillTransfer) this.selectByPrimaryKey(billTransfer.getId());
        List<BillTransferItem> itemList = new ArrayList<BillTransferItem>(1);
        itemList.add(item);
        newBillTransfer.setItemList(itemList);
        return newBillTransfer;
    }

    @Override
    public void updateItemById(BillTransferItem item)
    {
        if (item.getBillId() != null)
        {
            // 检查单据状态
            String statusString = this.getBillCanEdit("bill_transfer", ShiroUtils.getCompanyNo(), item.getBillId());
            if (StringUtils.isNotEmpty(statusString))
            {
                throw new ServiceAccessException(statusString);
            }
            BillTransferItem newItem = new BillTransferItem();
            newItem.setId(item.getId());
            newItem.setOutNum(item.getNum());
            newItem.setOutCostPrice(item.getCostPrice());
            newItem.setOutGoldWeight(item.getGoldWeight());
            newItem.setOutLabelPriceSum(item.getLabelPriceSum());
            newItem.setOutMJewelWeight(item.getmJewelWeight());
            newItem.setOutRemarks(item.getOutRemarks());
            billTransferItemService.updateByPrimaryKeySelective(newItem);
        }
    }
}