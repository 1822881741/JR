package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.dao.UniversalclassMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.Universalclass;
import cn.jiafeng.erp.data.adapter.extend.exception.ServiceVerify;
import cn.jiafeng.erp.data.adapter.model.dto.AddResult;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.UniversalclassDto;
import cn.jiafeng.erp.data.adapter.service.UniversalclassService;
import cn.jiafeng.erp.data.adapter.util.MapperUtil;
import freemarker.core.ReturnInstruction.Return;

/**
 * 通用类型（简单下拉列表） Service实现
 * 
 * @author
 * @date 2018-11-12
 */
@Service
@Transactional
public class UniversalclassServiceImpl implements UniversalclassService {

	/**
	 * 通用类型（简单下拉列表） Dao
	 */
	@Autowired
	private UniversalclassMapper universalclassDao;

	@Override
	@Transactional(readOnly = true)
	public Universalclass getUniversalclassById(Integer id) {
		return universalclassDao.getById(id);
	}

	@Override
	public List<AddResult> insertUniversalclass(List<UniversalclassDto> models) throws Exception {
		ServiceVerify.Verify(models == null || models.size() < 1, "基础数据不能为空");
		List<Universalclass> newlist = MapperUtil.MapperToArray(models, Universalclass.class);
		universalclassDao.insertBatch(newlist);
		return MapperUtil.MapperToArray(newlist, AddResult.class);
	}

	@Override
	public int updatePartUniversalclass(Universalclass universalclass) throws Exception {
		return universalclassDao.updatePart(universalclass);
	}

	@Override
	public int deleteUniversalclass(Integer id) {
		return universalclassDao.deleteByPk(id);
	}

	@Override
	public void delByCompanyNoAndRemarks(String companyNo, String remarks) throws Exception {
		ServiceVerify.Verify(companyNo.equalsIgnoreCase(""), "企业编号不能为空");
		ServiceVerify.Verify(remarks.equalsIgnoreCase(""), "备注不能为空");
		universalclassDao.delByCompanyNoAndRemarks(companyNo, remarks);
	}

	@Override
	@Transactional
	public void delByIds(BaseParamters param) throws Exception {
		ServiceVerify.Verify(param == null, "企业编号不能为空");
		ServiceVerify.Verify(param.getCompanyNo() == null, "企业编号不能为空");
		ServiceVerify.Verify(param.getIds() == null || param.getIds().size() < 1, "id不能为空");
		universalclassDao.delByIds(param);
	}

}
