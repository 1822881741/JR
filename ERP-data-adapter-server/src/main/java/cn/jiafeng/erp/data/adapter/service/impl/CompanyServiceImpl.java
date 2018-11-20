package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.CompanyService;
import cn.jiafeng.erp.data.adapter.dao.CompanyMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.Company;

/**
 * 公司客户 Service实现
 * 
 * @author 
 * @date 2018-11-14
 */
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    /**
     * 公司客户 Dao
     */
    @Autowired
    private CompanyMapper companyDao;
    
    @Override
    @Transactional(readOnly = true)
    public Company getCompanyById( Integer id ){
        return companyDao.getById( id );
    }

    @Override
    public int insertCompany(Company company) throws Exception{		
        return companyDao.insert(company);
    }
    
    @Override
    public int updatePartCompany(Company company) throws Exception{
        return companyDao.updatePart(company);
    }

    @Override
    public int deleteCompany( Integer id ) {
        return companyDao.deleteByPk( id );
    }

}
