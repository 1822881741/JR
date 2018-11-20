package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.dao.AreainfoMapper;
import cn.jiafeng.erp.data.adapter.dao.CompanyMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.Areainfo;
import cn.jiafeng.erp.data.adapter.dao.entity.Company;
import cn.jiafeng.erp.data.adapter.extend.exception.ServiceVerify;
import cn.jiafeng.erp.data.adapter.model.dto.AreainfoDto;
import cn.jiafeng.erp.data.adapter.service.AreainfoService;
import cn.jiafeng.erp.data.adapter.util.MapperUtil;

/**
 * 系统区域，在后台维护，不在前台显示，用于用户数据权限的控制 Service实现
 * 
 * @author
 * @date 2018-11-12
 */
@Service
@Transactional
public class AreainfoServiceImpl implements AreainfoService {

	/**
	 * 系统区域，在后台维护，不在前台显示，用于用户数据权限的控制 Dao
	 */
	@Autowired
	private AreainfoMapper areainfoDao;

	@Autowired
	private CompanyMapper companyDao;

	@Override
	@Transactional(readOnly = true)
	public Areainfo getAreainfoById(Integer id) {
		return areainfoDao.getById(id);
	}

	@Override
	public int insertAreainfo(Areainfo areainfo) throws Exception {
		return areainfoDao.insert(areainfo);
	}

	@Override
	public int updatePartAreainfo(Areainfo areainfo) throws Exception {
		return areainfoDao.updatePart(areainfo);
	}

	@Override
	public int deleteAreainfo(Integer id) {
		return areainfoDao.deleteByPk(id);
	}

	@Override
	public List<AreainfoDto> getArea(String companyNo) throws Exception {
		Company company = companyDao.getByCompanyNo(companyNo);
		ServiceVerify.Verify(company == null, "企业编号错误");
		return MapperUtil.MapperToArray(areainfoDao.getAreaByCode(company.getAreaCode()), AreainfoDto.class);
	}
}
