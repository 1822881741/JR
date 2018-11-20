package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.ShopService;
import cn.jiafeng.erp.data.adapter.dao.ShopMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.Shop;

/**
 * 门店信息表 Service实现
 * 
 * @author 
 * @date 2018-11-12
 */
@Service
@Transactional
public class ShopServiceImpl implements ShopService {

    /**
     * 门店信息表 Dao
     */
    @Autowired
    private ShopMapper shopDao;
    
    @Override
    @Transactional(readOnly = true)
    public Shop getShopById( Integer id ){
        return shopDao.getById( id );
    }

    @Override
    public int insertShop(Shop shop) throws Exception{		
        return shopDao.insert(shop);
    }
    
    @Override
    public int updatePartShop(Shop shop) throws Exception{
        return shopDao.updatePart(shop);
    }

    @Override
    public int deleteShop( Integer id ) {
        return shopDao.deleteByPk( id );
    }

}
