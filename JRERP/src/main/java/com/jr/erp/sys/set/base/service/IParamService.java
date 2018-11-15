package com.jr.erp.sys.set.base.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.sys.set.base.entity.Param;

/**     
 * 类名称：IParamService    
 * 类描述： 参数设置
 * 创建人：admin    
 * 创建时间：2018年11月13日 下午6:22:22    
 * 修改人：admin    
 * 修改时间：2018年11月13日 下午6:22:22    
 * 修改备注：    
 * @version  1.0    
 */
public interface IParamService extends IBaseService<BaseEntity>{

    /**    
     * updateBillFlowParam(这里用一句话描述这个方法的作用)    
     * 保存单据流程参数       
     * @param @param companyNo
     * @param @param areaCode
     * @param @param model
     * @param @param paramMap     
     * @return void
     * @Exception 异常对象
    */
    void updateBillFlowParam(String companyNo, String areaCode, String module, Map<String, Object> paramMap);


    /**    
     * getParam(这里用一句话描述这个方法的作用)    
     * 获取参数对象       
     * @param @param companyNo
     * @param @param areaCode
     * @param @param module
     * @param @param paramName
     * @param @return     
     * @return List<Param>
     * @Exception 异常对象
    */
    Param getParam(String companyNo, String areaCode, String module, String paramName);
}
