package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.CustomerLevelService;
import cn.jiafeng.erp.data.adapter.util.MapperUtil;
import cn.jiafeng.erp.data.adapter.dao.CustomerLevelMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.CustomerLevel;
import cn.jiafeng.erp.data.adapter.dao.entity.Universalclass;
import cn.jiafeng.erp.data.adapter.extend.exception.ServiceVerify;
import cn.jiafeng.erp.data.adapter.model.dto.AddResult;
import cn.jiafeng.erp.data.adapter.model.dto.CustomerLevelDto;

/**
 * 会员等级设置表 Service实现
 * 
 * @author
 * @date 2018-11-12
 */
@Service
@Transactional
public class CustomerLevelServiceImpl implements CustomerLevelService {

	/**
	 * 会员等级设置表 Dao
	 */
	@Autowired
	private CustomerLevelMapper customerLevelDao;

	@Override
	@Transactional(readOnly = true)
	public CustomerLevel getCustomerLevelById(Integer id) {
		return customerLevelDao.getById(id);
	}

	@Override
	public List<AddResult> insertCustomerLevel(List<CustomerLevelDto> models) throws Exception {
		ServiceVerify.Verify(models == null || models.size() < 1, "会员等级为空");
		List<CustomerLevel> newlist = MapperUtil.MapperToArray(models, CustomerLevel.class);
		Date dt = new Date();
		newlist.forEach(s -> {
			s.setCreateTime(dt);
		});
		customerLevelDao.insertBatch(newlist);
		return MapperUtil.MapperToArray(newlist, AddResult.class);
	}

	@Override
	public int updatePartCustomerLevel(CustomerLevel customerLevel) throws Exception {
		return customerLevelDao.updatePart(customerLevel);
	}

	@Override
	public int deleteCustomerLevel(Integer id) {
		return customerLevelDao.deleteByPk(id);
	}

}
