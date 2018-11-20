
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.GoodsArchives;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品档案表 Dao
 * 
 * @author
 * @date 2018-11-12
 */
@Repository
public interface GoodsArchivesMapper {

	GoodsArchives getById(@Param("id") Integer id);

	int insert(GoodsArchives goodsArchives);

	int insertBatch(List<GoodsArchives> goodsArchivess);

	int update(GoodsArchives goodsArchives);

	int updatePart(GoodsArchives goodsArchives);

	int deleteByPk(@Param("id") Integer id);

	void delByCompanyNoAndRemarks(@Param("companyNo") String companyNo, @Param("remarks") String remarks);

	void delByIds(BaseParamters param);
}
