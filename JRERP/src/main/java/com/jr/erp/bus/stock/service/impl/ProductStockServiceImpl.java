package com.jr.erp.bus.stock.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.StringUtils;
import com.jr.erp.bill.purchase.entity.BillPurchase;
import com.jr.erp.bill.purchase.entity.BillPurchaseItem;
import com.jr.erp.bill.transfer.entity.BillTransfer;
import com.jr.erp.bill.transfer.entity.BillTransferItem;
import com.jr.erp.bus.stock.dao.ProductStockMapper;
import com.jr.erp.bus.stock.dto.StockQueryDTO;
import com.jr.erp.bus.stock.entity.ProductStock;
import com.jr.erp.bus.stock.entity.ProductStockExample;
import com.jr.erp.bus.stock.service.IProductStockService;
import com.jr.erp.bus.stock.vo.StockOperVo;

/**     
 * 类名称：ProductStockServiceImpl    
 * 类描述：库存管理service    
 * 创建人：admin    
 * 创建时间：2018年11月15日 下午5:51:11    
 * 修改人：admin    
 * 修改时间：2018年11月15日 下午5:51:11    
 * 修改备注：    
 * @version  1.0    
 */
@Service(value="productStockService")
public class ProductStockServiceImpl extends AbstractBaseService<ProductStock> implements IProductStockService
{

    @Autowired
    ProductStockMapper thisMappper;
    
    @Override
    public void addPurchaseStock(BillPurchase billPurchase, String counterCode)
    {
        for (BillPurchaseItem item : billPurchase.getItemList())
        {
            ProductStock stock = new ProductStock() ;
            BeanUtils.copyProperties(item,stock);
            this.insert(stock);
            
        }
    }

    @Override
    public List<ProductStock> queryStockByQueryBuilder(String querySql)
    {
        return thisMappper.queryStockByQueryBuilder(querySql);
    }

    @Override
    public void addPurchaseStock(BillTransfer billTransfer, String counterCode)
    {
        List<BillTransferItem> itemList = billTransfer.getItemList();
        if(CollectionUtils.isNotEmpty(itemList))
        {
            //获取本单的条码列表
            List<String> barcode = itemList.stream().map(BillTransferItem::getBarcode).collect(Collectors.toList());
            
            //获取目标仓库中已经存在的货
            List<ProductStock> ccc = thisMappper.queryExistStock(billTransfer.getCompanyNo(), billTransfer.getInAreaCode(),
                    counterCode, StringUtils.addQuoteToStr(barcode));
            
            Map<String,Integer> resultMap = new HashMap<String,Integer>();
            for (ProductStock productStock : ccc)
            {
                resultMap.put(productStock.getBarcode(), productStock.getId());
            }
            
            for (BillTransferItem item : billTransfer.getItemList())
            {
                if(resultMap.containsKey(item.getBarcode()))
                {
                    // 已经存在了
                    System.out.println("---------已经存在了-------------" + item.getBarcode());
                    StockOperVo vo = new StockOperVo(1, resultMap.get(item.getBarcode()), 1, 300.87, 83882.92, 14.2223);
                    thisMappper.stockPlus(vo);

                }else
                {
                    //不存在，直接插入
                    ProductStock stock = new ProductStock() ;
                    BeanUtils.copyProperties(item,stock);
                    stock.setId(null);
                    stock.setAreaCode(billTransfer.getInAreaCode());
                    stock.setAreaName(billTransfer.getInAreaName());
                    stock.setCounterAreaCode(counterCode);
                    stock.setCounterAreaName(billTransfer.getCounterAreaName());
                    stock.setNum(item.getOutNum());
                    stock.setGoldWeight(item.getOutGoldWeight());
                    stock.setmJewelWeight(item.getOutMJewelWeight());
                    stock.setLabelPriceSum(item.getOutLabelPriceSum());
                    this.insert(stock);
                }
            }
        }
    }

    @Override
    public List<ProductStock> queryStock(StockQueryDTO dto)
    {
        ProductStockExample example = new ProductStockExample();
        ProductStockExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyNoEqualTo(ShiroUtils.getCompanyNo()).andHasStockEqualTo(1);
        if(StringUtils.isNotEmpty(dto.getAreaCode()))
        {
            criteria.andAreaCodeEqualTo(dto.getAreaCode());
        }
        if(StringUtils.isNotEmpty(dto.getCounterAreaCode()))
        {
            criteria.andCounterAreaCodeEqualTo(dto.getCounterAreaCode());
        }
        switch (dto.getQueryType())
        {
        case "0":
            criteria.andBarcodeEqualTo(dto.getQueryValue());
            break;
        case "1":
            criteria.andOldBarcodeEqualTo(dto.getQueryValue());
            break;
        case "2":
            criteria.andCertificateNoEqualTo(dto.getQueryValue());
            break;
        case "3":
            criteria.andComStyleNoEqualTo(dto.getQueryValue());
            break;
        default:
            break;
        }
        return (List)this.selectByExample(example);
    }
}
