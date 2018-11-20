
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.Store;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;


/**
 * 仓库、柜台 Dao
 * 
 * @author 
 * @date 2018-11-12
 */
@Repository
public interface StoreMapper{

    Store getById(@Param("id") Integer id );
    
    int insert(Store store);
    
    int insertBatch(List<Store> stores);
    
    int update(Store store);
    
    int updatePart(Store store);
    
    int deleteByPk(@Param("id") Integer id );
    
}
