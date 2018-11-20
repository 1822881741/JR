package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Shop;

/**
 * 门店信息表 Service
 * 
 * @author 
 * @date 2018-11-12
 */
public interface ShopService {

    /**
     * 根据id查询门店信息表
     * 
     * @param id 自增主键
     * @return 门店信息表
     */
    Shop getShopById( Integer id );


    /**
     * 保存门店信息表
     * 
     * @param shop 门店信息表
     * @return 操作影响行数
     */
    int insertShop(Shop shop) throws Exception;

    /**
     * 局部更新门店信息表
     * 
     * @param shop 门店信息表
     * @return 操作影响行数
     */
    int updatePartShop(Shop shop) throws Exception;

    /**
     * 根据主键删除门店信息表
     * 
     * @param id 自增主键
     * @return 操作影响行数
     */
    int deleteShop( Integer id );

}
