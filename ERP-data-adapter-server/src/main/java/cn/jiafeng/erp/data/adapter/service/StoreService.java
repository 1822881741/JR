package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Store;

/**
 * 仓库、柜台 Service
 * 
 * @author 
 * @date 2018-11-12
 */
public interface StoreService {

    /**
     * 根据id查询仓库、柜台
     * 
     * @param id 自增主键
     * @return 仓库、柜台
     */
    Store getStoreById( Integer id );


    /**
     * 保存仓库、柜台
     * 
     * @param store 仓库、柜台
     * @return 操作影响行数
     */
    int insertStore(Store store) throws Exception;

    /**
     * 局部更新仓库、柜台
     * 
     * @param store 仓库、柜台
     * @return 操作影响行数
     */
    int updatePartStore(Store store) throws Exception;

    /**
     * 根据主键删除仓库、柜台
     * 
     * @param id 自增主键
     * @return 操作影响行数
     */
    int deleteStore( Integer id );

}
