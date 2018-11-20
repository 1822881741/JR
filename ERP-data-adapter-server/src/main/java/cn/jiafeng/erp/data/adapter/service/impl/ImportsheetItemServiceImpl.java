package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.ImportsheetItemService;
import cn.jiafeng.erp.data.adapter.dao.ImportsheetItemMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.ImportsheetItem;

/**
 * 入库单详情 Service实现
 * 
 * @author 
 * @date 2018-11-12
 */
@Service
@Transactional
public class ImportsheetItemServiceImpl implements ImportsheetItemService {

    /**
     * 入库单详情 Dao
     */
    @Autowired
    private ImportsheetItemMapper importsheetItemDao;
    
    @Override
    @Transactional(readOnly = true)
    public ImportsheetItem getImportsheetItemById( Integer id ){
        return importsheetItemDao.getById( id );
    }

    @Override
    public int insertImportsheetItem(ImportsheetItem importsheetItem) throws Exception{		
        return importsheetItemDao.insert(importsheetItem);
    }
    
    @Override
    public int updatePartImportsheetItem(ImportsheetItem importsheetItem) throws Exception{
        return importsheetItemDao.updatePart(importsheetItem);
    }

    @Override
    public int deleteImportsheetItem( Integer id ) {
        return importsheetItemDao.deleteByPk( id );
    }

}
