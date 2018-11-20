package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.CustomerLevel;
import cn.jiafeng.erp.data.adapter.model.dto.AddResult;
import cn.jiafeng.erp.data.adapter.model.dto.CustomerLevelDto;

/**
 * 会员等级设置表 Service
 * 
 * @author 
 * @date 2018-11-12
 */
public interface CustomerLevelService {

    /**
     * 根据id查询会员等级设置表
     * 
     * @param id id
     * @return 会员等级设置表
     */
    CustomerLevel getCustomerLevelById( Integer id );


    /**
     * 保存会员等级设置表
     * 
     * @param customerLevel 会员等级设置表
     * @return 操作影响行数
     */
    List<AddResult> insertCustomerLevel(List<CustomerLevelDto> models) throws Exception;

    /**
     * 局部更新会员等级设置表
     * 
     * @param customerLevel 会员等级设置表
     * @return 操作影响行数
     */
    int updatePartCustomerLevel(CustomerLevel customerLevel) throws Exception;

    /**
     * 根据主键删除会员等级设置表
     * 
     * @param id id
     * @return 操作影响行数
     */
    int deleteCustomerLevel( Integer id );

}
