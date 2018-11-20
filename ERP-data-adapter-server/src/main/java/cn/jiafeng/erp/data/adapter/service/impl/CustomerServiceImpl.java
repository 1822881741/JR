package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.CustomerService;
import cn.jiafeng.erp.data.adapter.dao.CustomerMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.Customer;

/**
 * 客户会员表 Service实现
 * 
 * @author 
 * @date 2018-11-12
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    /**
     * 客户会员表 Dao
     */
    @Autowired
    private CustomerMapper customerDao;
    
    @Override
    @Transactional(readOnly = true)
    public Customer getCustomerById( Integer id ){
        return customerDao.getById( id );
    }

    @Override
    public int insertCustomer(Customer customer) throws Exception{		
        return customerDao.insert(customer);
    }
    
    @Override
    public int updatePartCustomer(Customer customer) throws Exception{
        return customerDao.updatePart(customer);
    }

    @Override
    public int deleteCustomer( Integer id ) {
        return customerDao.deleteByPk( id );
    }

}
