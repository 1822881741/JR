package com.jr.erp.bus.stock.service.impl;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.bill.purchase.entity.BillPurchase;
import com.jr.erp.bill.purchase.entity.BillPurchaseItem;
import com.jr.erp.bus.stock.entity.ProductStock;
import com.jr.erp.bus.stock.service.IProductStockService;

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

    @Override
    public void addPurchaseStock(BillPurchase billPurchase, String counterCode)
    {
        for (BillPurchaseItem item : billPurchase.getItemList())
        {
            ProductStock stock = new ProductStock() ;
            try
            {
                BeanUtils.copyProperties(stock, item);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            this.insert(stock);
            
        }
    }
}
