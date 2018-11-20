package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.StoreService;
import cn.jiafeng.erp.data.adapter.dao.StoreMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.Store;

/**
 * 仓库、柜台 Service实现
 * 
 * @author 
 * @date 2018-11-12
 */
@Service
@Transactional
public class StoreServiceImpl implements StoreService {

    /**
     * 仓库、柜台 Dao
     */
    @Autowired
    private StoreMapper storeDao;
    
    @Override
    @Transactional(readOnly = true)
    public Store getStoreById( Integer id ){
        return storeDao.getById( id );
    }

    @Override
    public int insertStore(Store store) throws Exception{		
        return storeDao.insert(store);
    }
    
    @Override
    public int updatePartStore(Store store) throws Exception{
        return storeDao.updatePart(store);
    }

    @Override
    public int deleteStore( Integer id ) {
        return storeDao.deleteByPk( id );
    }

}
