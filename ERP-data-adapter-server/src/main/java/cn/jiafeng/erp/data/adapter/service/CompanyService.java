package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Company;

/**
 * 公司客户 Service
 * 
 * @author 
 * @date 2018-11-14
 */
public interface CompanyService {

    /**
     * 根据id查询公司客户
     * 
     * @param id 自增主键
     * @return 公司客户
     */
    Company getCompanyById( Integer id );


    /**
     * 保存公司客户
     * 
     * @param company 公司客户
     * @return 操作影响行数
     */
    int insertCompany(Company company) throws Exception;

    /**
     * 局部更新公司客户
     * 
     * @param company 公司客户
     * @return 操作影响行数
     */
    int updatePartCompany(Company company) throws Exception;

    /**
     * 根据主键删除公司客户
     * 
     * @param id 自增主键
     * @return 操作影响行数
     */
    int deleteCompany( Integer id );

}
