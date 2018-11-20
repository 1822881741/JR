
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.Customer;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;


/**
 * 客户会员表 Dao
 * 
 * @author 
 * @date 2018-11-12
 */
@Repository
public interface CustomerMapper{

    Customer getById(@Param("id") Integer id );
    
    int insert(Customer customer);
    
    int insertBatch(List<Customer> customers);
    
    int update(Customer customer);
    
    int updatePart(Customer customer);
    
    int deleteByPk(@Param("id") Integer id );
    
}
