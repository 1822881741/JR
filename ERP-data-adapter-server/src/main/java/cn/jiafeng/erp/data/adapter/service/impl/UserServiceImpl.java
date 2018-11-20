package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.UserService;
import cn.jiafeng.erp.data.adapter.dao.UserMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.User;

/**
 * 系统用户 Service实现
 * 
 * @author 
 * @date 2018-11-12
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    /**
     * 系统用户 Dao
     */
    @Autowired
    private UserMapper userDao;
    
    @Override
    @Transactional(readOnly = true)
    public User getUserById( Integer id ){
        return userDao.getById( id );
    }

    @Override
    public int insertUser(User user) throws Exception{		
        return userDao.insert(user);
    }
    
    @Override
    public int updatePartUser(User user) throws Exception{
        return userDao.updatePart(user);
    }

    @Override
    public int deleteUser( Integer id ) {
        return userDao.deleteByPk( id );
    }

}
