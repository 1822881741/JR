
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.ImportsheetItem;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 入库单详情 Dao
 * 
 * @author
 * @date 2018-11-12
 */
@Repository
public interface ImportsheetItemMapper {

	ImportsheetItem getById(@Param("id") Integer id);

	int insert(ImportsheetItem importsheetItem);

	int insertBatch(List<ImportsheetItem> importsheetItems);

	int update(ImportsheetItem importsheetItem);

	int updatePart(ImportsheetItem importsheetItem);

	int deleteByPk(@Param("id") Integer id);

	void delBySheetIds(BaseParamters param);

}
