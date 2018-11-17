package com.jr.erp.sys.set.base.service;

import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;

/**     
 * 类名称：IBarcodeService    
 * 类描述： 获取单号前缀   
 * 创建人：admin    
 * 创建时间：2018年11月17日 下午4:57:08    
 * 修改人：admin    
 * 修改时间：2018年11月17日 下午4:57:08    
 * 修改备注：    
 * @version  1.0    
 */
public interface IBarcodeService extends IBaseService<BaseEntity>{
    
    /**    
     * getBarcode(这里用一句话描述这个方法的作用)    
     * 获取一个条码号       
     * @param @param companyNo
     * @param @param userPrefix
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    String getBarcode();
    
    /**    
     * getMutilBarcode(这里用一句话描述这个方法的作用)    
     * 获取多个条码号       
     * @param @param companyNo
     * @param @param codeNum
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    List<String> getBarcode(int number);
}
