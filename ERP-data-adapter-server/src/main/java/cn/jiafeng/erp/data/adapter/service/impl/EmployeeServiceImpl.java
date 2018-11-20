package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.EmployeeService;
import cn.jiafeng.erp.data.adapter.dao.CompanyMapper;
import cn.jiafeng.erp.data.adapter.dao.EmployeeMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.Company;
import cn.jiafeng.erp.data.adapter.dao.entity.Employee;
import cn.jiafeng.erp.data.adapter.extend.exception.ServiceVerify;

/**
 * 员工表 Service实现
 * 
 * @author 
 * @date 2018-11-12
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    /**
     * 员工表 Dao
     */
    @Autowired
    private EmployeeMapper employeeDao;
    
    @Autowired
	private CompanyMapper companyDao;
    
    @Override
    @Transactional(readOnly = true)
    public Employee getEmployeeById( Integer id ){
        return employeeDao.getById( id );
    }

    @Override
    public int insertEmployee(Employee employee) throws Exception{		
        return employeeDao.insert(employee);
    }
    
    @Override
    public int updatePartEmployee(Employee employee) throws Exception{
        return employeeDao.updatePart(employee);
    }

    @Override
    public int deleteEmployee( Integer id ) {
        return employeeDao.deleteByPk( id );
    }

	@Override
	public List<Employee> getEmployeeByCompanyNo(String companyNo) throws Exception{
		Company company = companyDao.getByCompanyNo(companyNo);
		ServiceVerify.Verify(company == null, "企业编号错误");
		return employeeDao.getEmployeeByAreaCode(company.getAreaCode());		
	}
}
