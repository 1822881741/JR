package com.jr.erp.sys.service;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.entity.SysPurchaseSecheme;

/**     
 * 类名称：ISysPurchaseSechemeService    
 * 类描述：导入方案    
 * 创建人：admin    
 * 创建时间：2018年10月22日 下午5:50:33    
 * 修改人：admin    
 * 修改时间：2018年10月22日 下午5:50:33    
 * 修改备注：    
 * @version  1.0    
 */
public interface ISysPurchaseSechemeService extends IBaseService<BaseEntity>
{

    /**    
     * getById(这里用一句话描述这个方法的作用)    
     * 根据id获取方案，含明细       
     * @param @param sechemeId
     * @param @return     
     * @return SysPurchaseSecheme
     * @Exception 异常对象
    */
    SysPurchaseSecheme getById(Integer sechemeId);

    /**    
     * saveSecheme(这里用一句话描述这个方法的作用)    
     * 保存方案成功       
     * @param @param secheme     
     * @return void
     * @Exception 异常对象
    */
    void saveSecheme(SysPurchaseSecheme secheme);

}
