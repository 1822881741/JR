
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.Shop;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;


/**
 * 门店信息表 Dao
 * 
 * @author 
 * @date 2018-11-12
 */
@Repository
public interface ShopMapper{

    Shop getById(@Param("id") Integer id );
    
    int insert(Shop shop);
    
    int insertBatch(List<Shop> shops);
    
    int update(Shop shop);
    
    int updatePart(Shop shop);
    
    int deleteByPk(@Param("id") Integer id );
    
}
