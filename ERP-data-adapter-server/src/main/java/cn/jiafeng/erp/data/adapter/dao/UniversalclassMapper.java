
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.Universalclass;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 通用类型（简单下拉列表） Dao
 * 
 * @author
 * @date 2018-11-12
 */
@Repository
public interface UniversalclassMapper {

	Universalclass getById(@Param("id") Integer id);

	int insert(Universalclass universalclass);

	int insertBatch(List<Universalclass> universalclasss);

	int update(Universalclass universalclass);

	int updatePart(Universalclass universalclass);

	int deleteByPk(@Param("id") Integer id);

	void delByCompanyNoAndRemarks(@Param("companyNo") String companyNo, @Param("remarks") String remarks);

	void delByIds(BaseParamters param);
}
