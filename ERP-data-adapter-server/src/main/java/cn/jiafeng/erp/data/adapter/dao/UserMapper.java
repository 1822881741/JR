
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.User;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;


/**
 * 系统用户 Dao
 * 
 * @author 
 * @date 2018-11-12
 */
@Repository
public interface UserMapper{

    User getById(@Param("id") Integer id );
    
    int insert(User user);
    
    int insertBatch(List<User> users);
    
    int update(User user);
    
    int updatePart(User user);
    
    int deleteByPk(@Param("id") Integer id );
    
}
