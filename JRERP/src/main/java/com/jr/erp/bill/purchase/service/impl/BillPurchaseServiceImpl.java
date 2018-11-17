package com.jr.erp.bill.purchase.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.jr.erp.base.exception.ServiceAccessException;
import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.service.impl.IFileUploadService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.NumberUtils;
import com.jr.erp.bill.purchase.dao.BillPurchaseItemMapper;
import com.jr.erp.bill.purchase.entity.BillPurchase;
import com.jr.erp.bill.purchase.entity.BillPurchaseExample;
import com.jr.erp.bill.purchase.entity.BillPurchaseItem;
import com.jr.erp.bill.purchase.entity.BillPurchaseItemExample;
import com.jr.erp.bill.purchase.service.IBillPurchaseService;
import com.jr.erp.bill.utils.Constance;
import com.jr.erp.bus.stock.service.IProductStockService;
import com.jr.erp.sys.set.base.entity.Param;
import com.jr.erp.sys.set.base.service.IBarcodeService;
import com.jr.erp.sys.set.base.service.IParamService;
import com.jr.erp.sys.set.purchase.entity.PurchaseSecheme;
import com.jr.erp.sys.set.purchase.entity.PurchaseSechemeItem;
import com.jr.erp.sys.set.purchase.service.IPurchaseSechemeService;

@Service(value="billPurchaseServiceImpl")
public class BillPurchaseServiceImpl extends AbstractBaseService<BillPurchase> implements IBillPurchaseService
{

    @Autowired
    private  BillPurchaseItemMapper itemMapper;
    
    @Autowired
    IPurchaseSechemeService sysPurchaseSechemeService;
    
    @Autowired
    IFileUploadService fileUploadService;
    
    @Autowired
    IParamService paramService;
    
    @Autowired
    IProductStockService productStockService;
    
    @Autowired
    IBarcodeService  barcodeService;
    
    @Override
    public List<JSONObject> parseImportExcel(String companyNo, Integer sechemeId, MultipartFile file)
    {
        try
        {
            List<List<String>> excelData  = fileUploadService.excelFileUpload(file, companyNo);
            List<JSONObject>  dataList = convertExcelData(excelData, sechemeId);
            return dataList;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    private List<JSONObject> convertExcelData(List<List<String>> result, Integer sechemeId)
    {
        List<JSONObject> goodsListVo = new ArrayList<JSONObject>();
        PurchaseSecheme secheme = sysPurchaseSechemeService.getById(sechemeId);
        List<PurchaseSechemeItem>  itemList= secheme.getItemList();
        // 如果是石料属性
        if (CollectionUtils.isNotEmpty(result))
        {
            // 只取第一个sheet的内容
            int index = 0;
            for (List<String> rowData : result)
            {
                // 忽略表头
                if (index == 0)
                {
                    index++;
                } else
                {
                    JSONObject jsonObject = new JSONObject();
                    try
                    {
                        // 循环方案中设置的所有列
                        for (PurchaseSechemeItem item : itemList)
                        {
                            Integer orderIndex = item.getOrderColumn();
                            if (orderIndex != null && orderIndex != 0)
                            {
                                String excelColumnData = StringUtils.isNotEmpty(rowData.get(orderIndex - 1)) ? rowData.get(orderIndex - 1) : "";
                                if(StringUtils.isEmpty(excelColumnData))
                                {
                                    continue;
                                }
                                Object resultObj = null;
                                // 整数类型
                                if (item.getParamType() == 1)
                                {
                                   
                                    resultObj =  NumberUtils.isNumber(excelColumnData)?(int)NumberUtils.toDouble(excelColumnData):0;
                                }
                                // double类型
                                else if (item.getParamType() == 2)
                                {
                                    double _value = 0;
                                    try
                                    {
                                        if(StringUtils.isNotEmpty(excelColumnData))
                                        {
                                            _value = NumberUtils.isNumber(excelColumnData)?NumberUtils.toDouble(excelColumnData):0;
                                        }
                                    } catch (Exception e)
                                    {
                                        e.printStackTrace();
                                        _value = 0;
                                    }
                                    if (null != item.getDigits())
                                    {
                                        resultObj = String.format("%." + item.getDigits() + "f", _value);
                                    } else
                                    {
                                        resultObj = String.format("%.2f", _value);
                                    }
                                }
                                // 通用类型
                                else if (item.getParamType() == 3)
                                {
                                    resultObj = excelColumnData;
                                }
                                // 字符串类型
                                else
                                {
                                    resultObj = excelColumnData;
                                }
                                if (resultObj != null)
                                {
                                    jsonObject.put(item.getBeanColumn(), resultObj);
                                }
                            }
                        }
                        goodsListVo.add(jsonObject);
                        index++;
                    } catch (Exception e)
                    {
                        jsonObject.put("msg", "解析行失败，请确认excel格式是否正确，或选择的策略是否正确");
                        goodsListVo.add(jsonObject);
                        e.printStackTrace();
                    }
                }
            }
        }
        return goodsListVo;
    }

    @Override
    public BillPurchase saveImportBill(BillPurchase billPurchase)
    {
        billPurchase.setBillStatus(Constance.BILL_STATUS_NEW);
        billPurchase.setBillType(Constance.BILL_TYPE_PURCHASE);
        billPurchase.setCreateUserId(ShiroUtils.getUserId());
        billPurchase.setCreateUserName(ShiroUtils.getSysUser().getRealName());
        this.insert(billPurchase);
        if(CollectionUtils.isNotEmpty(billPurchase.getItemList()))
        {
            List<BillPurchaseItem> itemList = billPurchase.getItemList();
            List<String> barcodeList = barcodeService.getBarcode(itemList.size());
            for (int i = 0; i < billPurchase.getItemList().size(); i++)
            {
                BillPurchaseItem temp = itemList.get(i);
                temp.setCompanyNo(billPurchase.getCompanyNo());
                temp.setBillId(billPurchase.getId());
                temp.setBarcode(barcodeList.get(i));
                itemMapper.insert(temp);
            }
        }
        BillPurchase newPurchase = (BillPurchase) this.selectByPrimaryKey(billPurchase.getId());
        BillPurchaseItemExample example = new BillPurchaseItemExample();
        example.createCriteria().andCompanyNoEqualTo(billPurchase.getCompanyNo()).andBillIdEqualTo(billPurchase.getId());
        List<BillPurchaseItem> itemList = itemMapper.selectByExample(example);
        newPurchase.setItemList(itemList);
        return newPurchase;
    }

    @Override
    public void saveBillAudit(BillPurchase billPurchase)
    {
        // 参数校验
        if (billPurchase.getId() == null)
        {
            throw new ServiceAccessException("单号为空，不能保存，请刷新重试");
        }
        // 检查单据是否存在，并检查是不是本公司的
        boolean exist = this.getBillExist("bill_purchase", billPurchase.getCompanyNo(), billPurchase.getId());
        if (!exist)
        {
            throw new ServiceAccessException("您要保存的单据不存在，或无权操作，请刷新重试");
        }
        // 检查单据状态
        String statusString = this.getBillCanEdit("bill_purchase", billPurchase.getCompanyNo(), billPurchase.getId());
        if (StringUtils.isNotEmpty(statusString))
        {
            throw new ServiceAccessException(statusString);
        }
        Param isAransit = paramService.getParam(billPurchase.getCompanyNo(), billPurchase.getAreaCode(), "purchase","isAransit");
        Param isAudit = paramService.getParam(billPurchase.getCompanyNo(), billPurchase.getAreaCode(), "purchase",
                "isAudit");

        BillPurchaseItemExample itemExample = new BillPurchaseItemExample();
        itemExample.createCriteria().andCompanyNoEqualTo(billPurchase.getCompanyNo())
                .andBillIdEqualTo(billPurchase.getId());
        List<BillPurchaseItem> itemList = (List) itemMapper.selectByExample(itemExample);

        //同步单据信息到明细中
        // 修改明细中的信息，与主单一致
        BillPurchaseItemExample example = new BillPurchaseItemExample();
        example.createCriteria().andCompanyNoEqualTo(billPurchase.getCompanyNo()).andBillIdEqualTo(billPurchase.getId());
        BillPurchaseItem recordTpl = new BillPurchaseItem();
        recordTpl.setAreaCode(billPurchase.getAreaCode());
        recordTpl.setAreaName(billPurchase.getAreaName());
        recordTpl.setCounterAreaCode(billPurchase.getCounterAreaCode());
        recordTpl.setCounterAreaName(billPurchase.getCounterAreaName());
        recordTpl.setCompanyNo(billPurchase.getCompanyNo());
        recordTpl.setBillDate(billPurchase.getBillDate());
        recordTpl.setBillNo(billPurchase.getBillNo());
        recordTpl.setSysBillNo(billPurchase.getSysBillNo());
        recordTpl.setPurchaseType(billPurchase.getPurchaseType());
        recordTpl.setSupplier(billPurchase.getSupplier());
        recordTpl.setBrandName(billPurchase.getBrandName());
        recordTpl.setEmployeeId(billPurchase.getEmployeeId());
        recordTpl.setEmployeeName(billPurchase.getEmployeeName());
        recordTpl.setCreateUserId(billPurchase.getCreateUserId());
        recordTpl.setCreateUserName(billPurchase.getCreateUserName());
        recordTpl.setBillType(billPurchase.getBillType());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("record", recordTpl);
        map.put("example", example);
        itemMapper.updateByExampleSelective(map);
        // 修改单据状态
        if (StringUtils.equals(isAransit.getParamValue(), "1"))
        {
            // 需要审核
            billPurchase.setBillStatus(Constance.BILL_STATUS_AUDIT_WAIT);
            processBillAndItem(billPurchase, itemList);
            this.updateByPrimaryKeySelective(billPurchase);
          
        } else
        {
            // 不需要审核
            // 进入在途仓库
            if (StringUtils.equals(isAudit.getParamValue(), "1"))
            {
                billPurchase.setBillStatus(Constance.BILL_STATUS_ONWAY_WAIT);
                processBillAndItem(billPurchase, itemList);
                this.updateByPrimaryKeySelective(billPurchase);
                String counterCode = billPurchase.getAreaCode() + "000";
                productStockService.addPurchaseStock(billPurchase, counterCode);
            } else
            {
                // 需要审核
                billPurchase.setBillStatus(Constance.BILL_STATUS_FINISH);
                processBillAndItem(billPurchase, itemList);
                this.updateByPrimaryKeySelective(billPurchase);
                productStockService.addPurchaseStock(billPurchase, billPurchase.getCounterAreaCode());
            }

        }

        this.updateByPrimaryKey(billPurchase);
    }

    @Override
    public Map<String, Object> getDesktopBill()
    {
        BillPurchaseExample example = new BillPurchaseExample();
        example.setOrderByClause(" billStatus, billDate");
        example.createCriteria().andCompanyNoEqualTo(ShiroUtils.getCompanyNo())
                .andCreateUserIdEqualTo(ShiroUtils.getUserId()).andBillTypeEqualTo(1)
                .andBillStatusIn(Arrays.asList(new Integer[]
        {0, 10, 15, 20, 25 }));
        List<BillPurchase> billList = (List) this.selectByExample(example);
        Map<String,Object> map = new HashMap<String,Object>();
        List<BillPurchase> noSave = new ArrayList<BillPurchase>();
        List<BillPurchase> waiting = new ArrayList<BillPurchase>();
        List<BillPurchase> reject = new ArrayList<BillPurchase>();
        for (BillPurchase billPurchase : billList)
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
    public BillPurchase getBillWithItem(Integer id)
    {
        BillPurchase billPurchase = (BillPurchase) this.selectByPrimaryKey(id);
        BillPurchaseItemExample example = new BillPurchaseItemExample();
        example.createCriteria().andCompanyNoEqualTo(billPurchase.getCompanyNo()).andBillIdEqualTo(billPurchase.getId());
        List<BillPurchaseItem> itemList = itemMapper.selectByExample(example);
        billPurchase.setItemList(itemList);
        return billPurchase;
    }
    
    private void processBillAndItem(BillPurchase billPurchase,List<BillPurchaseItem> itemList)
    {
        for (BillPurchaseItem tmp : itemList)
        {
            tmp.setAreaCode(billPurchase.getAreaCode());
            tmp.setAreaName(billPurchase.getAreaName());
            tmp.setCounterAreaCode(billPurchase.getCounterAreaCode());
            tmp.setCounterAreaName(billPurchase.getCounterAreaName());
            tmp.setCompanyNo(billPurchase.getCompanyNo());
            tmp.setBillDate(billPurchase.getBillDate());
            tmp.setBillNo(billPurchase.getBillNo());
            tmp.setSysBillNo(billPurchase.getSysBillNo());
            tmp.setPurchaseType(billPurchase.getPurchaseType());
            tmp.setSupplier(billPurchase.getSupplier());
            tmp.setBrandName(billPurchase.getBrandName());
            tmp.setEmployeeId(billPurchase.getEmployeeId());
            tmp.setEmployeeName(billPurchase.getEmployeeName());
            tmp.setCreateUserId(billPurchase.getCreateUserId());
            tmp.setCreateUserName(billPurchase.getCreateUserName());
            tmp.setBillType(billPurchase.getBillType());
            
            billPurchase.setTotaJewelWeight(NumberUtils.toDouble(tmp.getmJewelWeight())+NumberUtils.toDouble(billPurchase.getTotaJewelWeight()));
            billPurchase.setTotalCost(NumberUtils.toDouble(tmp.getCostPrice())+NumberUtils.toDouble(billPurchase.getTotalCost()));
            billPurchase.setTotalLabelPrice(NumberUtils.toDouble(tmp.getLabelPriceSum())+NumberUtils.toDouble(billPurchase.getTotalLabelPrice()));
            billPurchase.setTotalNum(NumberUtils.toInt(tmp.getNum())+NumberUtils.toInt(billPurchase.getTotalNum()));
            billPurchase.setTotalWorkFee(NumberUtils.toDouble(tmp.getWorkFeeSum())+NumberUtils.toDouble(billPurchase.getTotalWorkFee()));
            billPurchase.setItemList(itemList);
        }
    }
}