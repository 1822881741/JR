package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Universalclass;
import cn.jiafeng.erp.data.adapter.model.dto.AddResult;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.UniversalclassDto;

/**
 * 通用类型（简单下拉列表） Service
 * 
 * @author
 * @date 2018-11-12
 */
public interface UniversalclassService {

	/**
	 * 根据id查询通用类型（简单下拉列表）
	 * 
	 * @param id
	 *            id
	 * @return 通用类型（简单下拉列表）
	 */
	Universalclass getUniversalclassById(Integer id);

	/**
	 * 保存通用类型（简单下拉列表）
	 * 
	 * @param universalclass
	 *            通用类型（简单下拉列表）
	 * @return 操作影响行数
	 */
	List<AddResult> insertUniversalclass(List<UniversalclassDto> models) throws Exception;

	/**
	 * 局部更新通用类型（简单下拉列表）
	 * 
	 * @param universalclass
	 *            通用类型（简单下拉列表）
	 * @return 操作影响行数
	 */
	int updatePartUniversalclass(Universalclass universalclass) throws Exception;

	/**
	 * 根据主键删除通用类型（简单下拉列表）
	 * 
	 * @param id
	 *            id
	 * @return 操作影响行数
	 */
	int deleteUniversalclass(Integer id);

	/**
	 * 根据企业编号和备注来删基础数据
	 * 
	 * @param companyNo
	 * @param remarks
	 */
	void delByCompanyNoAndRemarks(String companyNo, String remarks) throws Exception;

	
	/**
	 * 根据id删基础数据
	 * @param ids
	 * @param companyNo
	 */
	void delByIds(BaseParamters param) throws Exception;
}
