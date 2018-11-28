package com.jr.erp.bus.stock.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.exception.ServiceAccessException;
import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.NumberUtils;
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
import com.jr.erp.sys.entity.SysAreaInfo;
import com.jr.erp.sys.service.ISysAreaInfoService;

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
    
    @Autowired
    ISysAreaInfoService sysAreaInfoService;
    @Override
    public void addPurchaseStock(BillPurchase billPurchase, String counterCode)
    {
        for (BillPurchaseItem item : billPurchase.getItemList())
        {
            ProductStock stock = new ProductStock() ;
            BeanUtils.copyProperties(item,stock);
            stock.setHasStock(1);
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
            SysAreaInfo storeInfo = sysAreaInfoService.selectByAreaCode(billTransfer.getCompanyNo(), billTransfer.getInAreaCode());
            SysAreaInfo counterInfo = sysAreaInfoService.selectByAreaCode(billTransfer.getCompanyNo(), counterCode);
            
            
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
                    //加库存
                    StockOperVo vo = new StockOperVo(null,resultMap.get(item.getBarcode()),item.getSecondType(), item.getOutNum(),item.getOutMJewelWeight(),item.getOutGoldWeight(), item.getOutCostPrice(), item.getOutLabelPriceSum());
                    this.stockAdd(vo);
                }else
                {
                    //不存在，直接插入
                    ProductStock stock = new ProductStock() ;
                    BeanUtils.copyProperties(item,stock);
                    stock.setId(null);
                    stock.setAreaCode(storeInfo.getAreaCode());
                    stock.setAreaName(storeInfo.getAreaName());
                    stock.setCounterAreaCode(counterInfo.getAreaCode());
                    stock.setCounterAreaName(counterInfo.getAreaName());
//                    stock.setNum(item.getOutNum());
                    stock.setGoldWeight(item.getOutGoldWeight());
                    stock.setmJewelWeight(item.getOutMJewelWeight());
                    stock.setLabelPriceSum(item.getOutLabelPriceSum());
                    
                    stock.setHasStock(1);
                    this.insert(stock);
                }
                
                //减库存
                StockOperVo vo = new StockOperVo(item.getOldStockId(),null,item.getSecondType(), item.getOutNum(),item.getOutMJewelWeight(),item.getOutGoldWeight(), item.getOutCostPrice(), item.getOutLabelPriceSum());
                this.stockSub(vo);
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

    @Override
    public void stockAdd(StockOperVo vo)
    {
        /*
         * 镶嵌： 变动字段：数量、成本金额、标价金额
         * K金： 变动字段：数量，货重、成本金额、标价金额 
         * 素金： 变动字段：数量、货重、成本金额，金重、 
         * 玉器： 变动字段：数量、 成本金额、标价金额 
         * 裸石： 变动字段：数量、 成本金额、标价金额、 石重,主石数 
         * 金镶： 变动字段：数量、 成本金额、标价金额
         * 旧料： 变动字段：金重、货重、成本金额
         */
        ProductStock stock = (ProductStock) selectByPrimaryKey(vo.getOldStockId());
        switch (stock.getSecondType())
        {
        case "inlay":
            stock.setNum(1);
            stock.setCostPrice(stock.getUnitPrice());
            stock.setLabelPriceSum(stock.getLabelPrice());
            stock.setHasStock(1);
            updateByPrimaryKeySelective(stock);
            break;
        case "kGold":
            stock.setNum(stock.getNum() + vo.getNumAlt());
            stock.setProductWeight(NumberUtils.add(stock.getProductWeight(), NumberUtils.mul(stock.getGoldWeight() , vo.getNumAlt())));
            stock.setCostPrice(NumberUtils.add(stock.getCostPrice(), NumberUtils.mul( stock.getUnitPrice(),vo.getNumAlt())));
            stock.setLabelPriceSum(NumberUtils.add(stock.getLabelPriceSum(), NumberUtils.mul(stock.getLabelPrice() , vo.getNumAlt())));
            stock.setHasStock(1);
            updateByPrimaryKeySelective(stock);
            break;
        case "gold":
            stock.setNum(stock.getNum() + vo.getNumAlt());
            stock.setProductWeight(NumberUtils.add(stock.getProductWeight(), vo.getGoldWeightAlt()));
            stock.setCostPrice(NumberUtils.add(stock.getCostPrice(), vo.getCostPriceAlt()));
            stock.setGoldWeight(NumberUtils.add(stock.getGoldWeight(), vo.getGoldWeightAlt()));
            stock.setHasStock(1);
            updateByPrimaryKeySelective(stock);
            break;
        case "jade":
            stock.setNum(stock.getNum() + vo.getNumAlt());
            stock.setCostPrice(NumberUtils.add(stock.getCostPrice(), NumberUtils.mul( stock.getUnitPrice(),vo.getNumAlt())));
            stock.setLabelPriceSum(NumberUtils.add(stock.getLabelPriceSum(), NumberUtils.mul(stock.getLabelPrice() , vo.getNumAlt())));
            stock.setHasStock(1);
            updateByPrimaryKeySelective(stock);
            break;
        case "jewel":
            stock.setNum(stock.getNum() + vo.getNumAlt());
            stock.setmJewelNum(stock.getmJewelNum() - vo.getNumAlt());
            stock.setmJewelWeight(NumberUtils.add(stock.getmJewelWeight(), vo.getmJewelWeightAlt()));
            stock.setCostPrice(NumberUtils.add(stock.getCostPrice(), NumberUtils.mul( stock.getUnitPrice(),vo.getNumAlt())));
            stock.setLabelPriceSum(NumberUtils.add(stock.getLabelPriceSum(), NumberUtils.mul(stock.getLabelPrice() , vo.getNumAlt())));
            stock.setHasStock(1);
            updateByPrimaryKeySelective(stock);
            break;
        case "goldJade":
            stock.setNum(1);
            stock.setCostPrice(stock.getUnitPrice());
            stock.setLabelPriceSum(stock.getLabelPrice());
            updateByPrimaryKeySelective(stock);
            break;
        case "material":
            stock.setProductWeight(NumberUtils.add(stock.getProductWeight(), vo.getGoldWeightAlt()));
            stock.setCostPrice(NumberUtils.add(stock.getCostPrice(), vo.getCostPriceAlt()));
            stock.setGoldWeight(NumberUtils.add(stock.getGoldWeight(), vo.getGoldWeightAlt()));
            stock.setHasStock(1);
            //单价重新核算
            updateByPrimaryKeySelective(stock);
            break;
        case "gift":
            stock.setNum(stock.getNum() + vo.getNumAlt());
            stock.setLabelPriceSum(NumberUtils.add(stock.getLabelPriceSum(), NumberUtils.mul(stock.getLabelPrice() , vo.getNumAlt())));
            stock.setCostPrice(NumberUtils.add(stock.getCostPrice(), NumberUtils.mul(stock.getUnitPrice() , vo.getNumAlt())));
            stock.setHasStock(1);
            //单价重新核算
            updateByPrimaryKeySelective(stock);
            break;
        default:
            break;
        }
    }
    @Override
    public void stockSub(StockOperVo vo) throws ServiceAccessException
    {
        /*
         * 素金： 变动字段：数量、货重、成本金额，金重、 
         * K 金：变动字段：数量，货重、成本金额、标价金额 
         * 镶嵌： 变动字段：数量、成本金额、标价金额 
         * 玉器： 变动字段：数量、 成本金额、标价金额 
         * 裸石： 变动字段：数量、 成本金额、标价金额、 石重,主石数 
         * 金镶： 变动字段：数量、 成本金额、标价金额
         * 旧料： 变动字段：金重、货重、成本金额
         */
        ProductStock stock = (ProductStock) selectByPrimaryKey(vo.getOldStockId());
        boolean canSub = checkCanUseStock(stock, vo);
        if(!canSub)
        {
            throw new ServiceAccessException("条码为【"+stock.getBarcode()+"】的当前库存小于扣减量");
        }
        //判断当前 库存数和要减少的库存数，是否够 扣的
        switch (vo.getSecondType())
        {
        case "inlay":
            stock.setNum(0);
            stock.setCostPrice(0.0);
            stock.setLabelPriceSum(0.0);
            stock.setHasStock(0);
            updateByPrimaryKeySelective(stock);
            break;
        case "kGold":
            stock.setNum(stock.getNum() - vo.getNumAlt());
            stock.setProductWeight(NumberUtils.sub(stock.getProductWeight(), NumberUtils.mul(stock.getGoldWeight() , vo.getNumAlt())));
            stock.setCostPrice(NumberUtils.sub(stock.getCostPrice(), NumberUtils.mul( stock.getUnitPrice(),vo.getNumAlt())));
            stock.setLabelPriceSum(NumberUtils.sub(stock.getLabelPriceSum(), NumberUtils.mul(stock.getLabelPrice() , vo.getNumAlt())));
            if(stock.getNum() == 0)
            {
                stock.setHasStock(0); 
            }else
            {
                stock.setHasStock(1); 
            }
            updateByPrimaryKeySelective(stock);
            break;
        case "gold":
            stock.setNum(stock.getNum() - vo.getNumAlt());
            stock.setProductWeight(NumberUtils.sub(stock.getProductWeight(), vo.getGoldWeightAlt()));
            stock.setCostPrice(NumberUtils.sub(stock.getCostPrice(), vo.getCostPriceAlt()));
            stock.setGoldWeight(NumberUtils.sub(stock.getGoldWeight(), vo.getGoldWeightAlt()));
            if(stock.getNum() == 0)
            {
                stock.setHasStock(0); 
            }else
            {
                stock.setHasStock(1); 
            }
            updateByPrimaryKeySelective(stock);
            break;
        case "jade":
            stock.setNum(stock.getNum() - vo.getNumAlt());
            stock.setCostPrice(NumberUtils.sub(stock.getCostPrice(), NumberUtils.mul( stock.getUnitPrice(),vo.getNumAlt())));
            stock.setLabelPriceSum(NumberUtils.sub(stock.getLabelPriceSum(), NumberUtils.mul(stock.getLabelPrice() , vo.getNumAlt())));
            stock.setHasStock(0);
            updateByPrimaryKeySelective(stock);
            break;
        case "jewel":
            stock.setNum(stock.getNum() - vo.getNumAlt());
            stock.setmJewelNum(stock.getmJewelNum() - vo.getNumAlt());
            stock.setmJewelWeight(NumberUtils.sub(stock.getmJewelWeight(), vo.getmJewelWeightAlt()));
            stock.setCostPrice(NumberUtils.sub(stock.getCostPrice(), NumberUtils.mul( stock.getUnitPrice(),vo.getNumAlt())));
            stock.setLabelPriceSum(NumberUtils.sub(stock.getLabelPriceSum(), NumberUtils.mul(stock.getLabelPrice() , vo.getNumAlt())));
            if(stock.getNum() == 0)
            {
                stock.setHasStock(0); 
            }else
            {
                stock.setHasStock(1); 
            }
            updateByPrimaryKeySelective(stock);
            break;
        case "goldJade":
            stock.setNum(0);
            stock.setCostPrice(0.0);
            stock.setLabelPriceSum(0.0);
            if(stock.getNum() == 0)
            {
                stock.setHasStock(0); 
            }else
            {
                stock.setHasStock(1); 
            }
            updateByPrimaryKeySelective(stock);
            break;
        case "material":
            stock.setProductWeight(NumberUtils.sub(stock.getProductWeight(), vo.getGoldWeightAlt()));
            stock.setCostPrice(NumberUtils.sub(stock.getCostPrice(), vo.getCostPriceAlt()));
            stock.setGoldWeight(NumberUtils.sub(stock.getGoldWeight(), vo.getGoldWeightAlt()));
            if(stock.getProductWeight() <= 0)
            {
                stock.setHasStock(0); 
            }else
            {
                stock.setHasStock(1); 
            }
            //单价重新核算
            updateByPrimaryKeySelective(stock);
            break;
        case "gift":
            stock.setNum(stock.getNum() - vo.getNumAlt());
            stock.setLabelPriceSum(NumberUtils.sub(stock.getLabelPriceSum(), NumberUtils.mul(stock.getLabelPrice() , vo.getNumAlt())));
            stock.setCostPrice(NumberUtils.sub(stock.getCostPrice(), NumberUtils.mul(stock.getUnitPrice() , vo.getNumAlt())));
            if(stock.getNum() == 0)
            {
                stock.setHasStock(0); 
            }else
            {
                stock.setHasStock(1); 
            }
            //单价重新核算
            updateByPrimaryKeySelective(stock);
            break;
        default:
            break;
        }
    }
    
    /**    
     * checkCanUseStock(这里用一句话描述这个方法的作用)    
     * 检查当前库存是否够扣减       
     * @param @param stock
     * @param @param vo
     * @param @return     
     * @return boolean
     * @Exception 异常对象
    */
    private boolean checkCanUseStock(ProductStock stock,StockOperVo vo)
    {
        switch (stock.getSecondType())
        {
        case "inlay":
            return stock.getNum() - 1 >= 0;
        case "kGold":
            return (stock.getNum() - vo.getNumAlt() >= 0)
                    && (NumberUtils.sub(stock.getProductWeight(),NumberUtils.mul(stock.getGoldWeight(), vo.getNumAlt())) >= 0)
                    && (NumberUtils.sub(stock.getCostPrice(),NumberUtils.mul(stock.getUnitPrice(), vo.getNumAlt())) >= 0)
                    && (NumberUtils.sub(stock.getLabelPriceSum(),NumberUtils.mul(stock.getLabelPrice(), vo.getNumAlt())) >= 0);
        case "gold":
            return (stock.getNum() - vo.getNumAlt() >= 0)
                    && (NumberUtils.sub(stock.getProductWeight(), vo.getGoldWeightAlt()) >= 0)
                    && (NumberUtils.sub(stock.getCostPrice(), vo.getCostPriceAlt()) >= 0)
                    && (NumberUtils.sub(stock.getGoldWeight(), vo.getGoldWeightAlt()) >= 0);
        case "jade":
            return (stock.getNum() - vo.getNumAlt() >= 0)
                    && (NumberUtils.sub(stock.getCostPrice(),NumberUtils.mul(stock.getUnitPrice(), vo.getNumAlt())) >= 0)
                    && (NumberUtils.sub(stock.getLabelPriceSum(),NumberUtils.mul(stock.getLabelPrice(), vo.getNumAlt())) >= 0);
        case "jewel":
            return (stock.getNum() - vo.getNumAlt() >= 0) && (stock.getmJewelNum() - vo.getNumAlt() >= 0)
                    && (NumberUtils.sub(stock.getmJewelWeight(), vo.getmJewelWeightAlt()) >= 0)
                    && (NumberUtils.sub(stock.getCostPrice(),NumberUtils.mul(stock.getUnitPrice(), vo.getNumAlt())) >= 0)
                    && (NumberUtils.sub(stock.getLabelPriceSum(),NumberUtils.mul(stock.getLabelPrice(), vo.getNumAlt())) >= 0);
        case "goldJade":
            return stock.getNum() - 1 >= 0;
        case "material":
            return (NumberUtils.sub(stock.getProductWeight(), vo.getGoldWeightAlt()) >= 0)
                    && (NumberUtils.sub(stock.getCostPrice(), vo.getCostPriceAlt()) >= 0)
                    && (NumberUtils.sub(stock.getGoldWeight(), vo.getGoldWeightAlt()) >= 0);
        case "gift":
            return (stock.getNum() - vo.getNumAlt() >= 0)
                    && (NumberUtils.sub(stock.getLabelPriceSum(),NumberUtils.mul(stock.getLabelPrice(), vo.getNumAlt())) >= 0)
                    && (NumberUtils.sub(stock.getCostPrice(),NumberUtils.mul(stock.getUnitPrice(), vo.getNumAlt())) >= 0);
        default:
            return true;
        }
    }
}
