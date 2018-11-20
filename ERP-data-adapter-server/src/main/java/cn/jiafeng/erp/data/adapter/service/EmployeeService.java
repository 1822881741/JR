package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Employee;

/**
 * 员工表 Service
 * 
 * @author 
 * @date 2018-11-12
 */
public interface EmployeeService {

    /**
     * 根据id查询员工表
     * 
     * @param id 员工ID
     * @return 员工表
     */
    Employee getEmployeeById( Integer id );


    /**
     * 保存员工表
     * 
     * @param employee 员工表
     * @return 操作影响行数
     */
    int insertEmployee(Employee employee) throws Exception;

    /**
     * 局部更新员工表
     * 
     * @param employee 员工表
     * @return 操作影响行数
     */
    int updatePartEmployee(Employee employee) throws Exception;

    /**
     * 根据主键删除员工表
     * 
     * @param id 员工ID
     * @return 操作影响行数
     */
    int deleteEmployee( Integer id );
    
    
    List<Employee> getEmployeeByCompanyNo(String companyNo) throws Exception;

}
