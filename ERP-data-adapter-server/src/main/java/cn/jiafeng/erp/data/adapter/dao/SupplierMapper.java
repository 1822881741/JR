
package cn.jiafeng.erp.data.adapter.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.jiafeng.erp.data.adapter.dao.entity.Supplier;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;

/**
 * 供应商表 Dao
 * 
 * @author
 * @date 2018-11-12
 */
@Repository
public interface SupplierMapper {

	Supplier getById(@Param("id") Integer id);

	int insert(Supplier supplier);

	int insertBatch(List<Supplier> suppliers);

	int update(Supplier supplier);

	int updatePart(Supplier supplier);

	int deleteByPk(@Param("id") Integer id);

	void delByCompanyNoAndCreatetime(@Param("companyNo") String companyNo, @Param("createTime") Date createTime);
	
	void delByIds(BaseParamters param);
}
