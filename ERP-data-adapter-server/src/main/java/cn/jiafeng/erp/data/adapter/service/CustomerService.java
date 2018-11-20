package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Customer;

/**
 * 客户会员表 Service
 * 
 * @author 
 * @date 2018-11-12
 */
public interface CustomerService {

    /**
     * 根据id查询客户会员表
     * 
     * @param id id
     * @return 客户会员表
     */
    Customer getCustomerById( Integer id );


    /**
     * 保存客户会员表
     * 
     * @param customer 客户会员表
     * @return 操作影响行数
     */
    int insertCustomer(Customer customer) throws Exception;

    /**
     * 局部更新客户会员表
     * 
     * @param customer 客户会员表
     * @return 操作影响行数
     */
    int updatePartCustomer(Customer customer) throws Exception;

    /**
     * 根据主键删除客户会员表
     * 
     * @param id id
     * @return 操作影响行数
     */
    int deleteCustomer( Integer id );

}
