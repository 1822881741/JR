
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.CustomerLevel;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;


/**
 * 会员等级设置表 Dao
 * 
 * @author 
 * @date 2018-11-12
 */
@Repository
public interface CustomerLevelMapper{

    CustomerLevel getById(@Param("id") Integer id );
    
    int insert(CustomerLevel customerLevel);
    
    int insertBatch(List<CustomerLevel> customerLevels);
    
    int update(CustomerLevel customerLevel);
    
    int updatePart(CustomerLevel customerLevel);
    
    int deleteByPk(@Param("id") Integer id );
    
}
