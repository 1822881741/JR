
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.Importsheet;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 入库单 Dao
 * 
 * @author
 * @date 2018-11-12
 */
@Repository
public interface ImportsheetMapper {

	Importsheet getById(@Param("id") Integer id);

	int insert(Importsheet importsheet);

	int insertBatch(List<Importsheet> importsheets);

	int update(Importsheet importsheet);

	int updatePart(Importsheet importsheet);

	int deleteByPk(@Param("id") Integer id);

	void delByIds(BaseParamters param);

	Integer getSheetNumber(@Param("companyNo") String companyNo);
}
