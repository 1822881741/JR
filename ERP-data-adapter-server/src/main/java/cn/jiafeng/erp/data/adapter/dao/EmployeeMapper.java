
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.Employee;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;


/**
 * 员工表 Dao
 * 
 * @author 
 * @date 2018-11-12
 */
@Repository
public interface EmployeeMapper{

    Employee getById(@Param("id") Integer id );
    
    int insert(Employee employee);
    
    int insertBatch(List<Employee> employees);
    
    int update(Employee employee);
    
    int updatePart(Employee employee);
    
    int deleteByPk(@Param("id") Integer id );
 
    List<Employee> getEmployeeByAreaCode(@Param("areaCode") String areaCode);
}
