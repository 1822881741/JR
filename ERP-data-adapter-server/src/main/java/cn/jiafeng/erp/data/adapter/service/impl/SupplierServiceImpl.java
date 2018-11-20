package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.SupplierService;
import cn.jiafeng.erp.data.adapter.util.MapperUtil;
import cn.jiafeng.erp.data.adapter.dao.SupplierMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.Supplier;
import cn.jiafeng.erp.data.adapter.dao.entity.Universalclass;
import cn.jiafeng.erp.data.adapter.extend.exception.ServiceVerify;
import cn.jiafeng.erp.data.adapter.model.dto.AddResult;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.SupplierDto;

/**
 * 供应商表 Service实现
 * 
 * @author
 * @date 2018-11-12
 */
@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

	/**
	 * 供应商表 Dao
	 */
	@Autowired
	private SupplierMapper supplierDao;

	@Override
	@Transactional(readOnly = true)
	public Supplier getSupplierById(Integer id) {
		return supplierDao.getById(id);
	}

	@Override
	public List<AddResult> insertSuppliers(List<SupplierDto> suppliers) throws Exception {
		ServiceVerify.Verify(suppliers == null || suppliers.size() < 1, "供应商不能为空");
		List<Supplier> newlist = MapperUtil.MapperToArray(suppliers, Supplier.class);
		supplierDao.insertBatch(newlist);
		return MapperUtil.MapperToArray(newlist, AddResult.class);
	}

	@Override
	public int updatePartSupplier(Supplier supplier) throws Exception {
		return supplierDao.updatePart(supplier);
	}

	@Override
	public int deleteSupplier(Integer id) {
		return supplierDao.deleteByPk(id);
	}

	@Override
	public void delByCompanyNoAndCreatetime(String companyNo, Date createTime) throws Exception {
		ServiceVerify.Verify(companyNo.equalsIgnoreCase(""), "企业编号不能为空");
		ServiceVerify.Verify(createTime == null, "创建时间不能为空");
		supplierDao.delByCompanyNoAndCreatetime(companyNo, createTime);
	}

	@Override
	@Transactional
	public void delByIds(BaseParamters param) throws Exception {
		ServiceVerify.Verify(param == null, "企业编号不能为空");
		ServiceVerify.Verify(param.getCompanyNo() == null, "企业编号不能为空");
		ServiceVerify.Verify(param.getIds() == null || param.getIds().size() < 1, "id不能为空");
		supplierDao.delByIds(param);
	}

}
