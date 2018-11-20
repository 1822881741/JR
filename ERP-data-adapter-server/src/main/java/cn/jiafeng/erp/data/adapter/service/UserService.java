package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.User;

/**
 * 系统用户 Service
 * 
 * @author 
 * @date 2018-11-12
 */
public interface UserService {

    /**
     * 根据id查询系统用户
     * 
     * @param id 自增主键
     * @return 系统用户
     */
    User getUserById( Integer id );


    /**
     * 保存系统用户
     * 
     * @param user 系统用户
     * @return 操作影响行数
     */
    int insertUser(User user) throws Exception;

    /**
     * 局部更新系统用户
     * 
     * @param user 系统用户
     * @return 操作影响行数
     */
    int updatePartUser(User user) throws Exception;

    /**
     * 根据主键删除系统用户
     * 
     * @param id 自增主键
     * @return 操作影响行数
     */
    int deleteUser( Integer id );

}
