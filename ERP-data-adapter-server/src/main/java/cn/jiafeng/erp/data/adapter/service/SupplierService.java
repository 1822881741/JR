package cn.jiafeng.erp.data.adapter.service;

import java.util.Date;
import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Supplier;
import cn.jiafeng.erp.data.adapter.model.dto.AddResult;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.SupplierDto;

/**
 * 供应商表 Service
 * 
 * @author
 * @date 2018-11-12
 */
public interface SupplierService {

	/**
	 * 根据id查询供应商表
	 * 
	 * @param id
	 *            供应商编号
	 * @return 供应商表
	 */
	Supplier getSupplierById(Integer id);

	/**
	 * 保存供应商表
	 * 
	 * @param supplier
	 *            供应商表
	 * @return 操作影响行数
	 */
	List<AddResult> insertSuppliers(List<SupplierDto> suppliers) throws Exception;

	/**
	 * 局部更新供应商表
	 * 
	 * @param supplier
	 *            供应商表
	 * @return 操作影响行数
	 */
	int updatePartSupplier(Supplier supplier) throws Exception;

	/**
	 * 根据主键删除供应商表
	 * 
	 * @param id
	 *            供应商编号
	 * @return 操作影响行数
	 */
	int deleteSupplier(Integer id);

	/**
	 * 根据
	 * 
	 * @param companyNo
	 * @param createtime
	 */
	void delByCompanyNoAndCreatetime(String companyNo, Date createTime) throws Exception;
	
	void delByIds(BaseParamters param) throws Exception;
}
