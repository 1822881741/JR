package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.ImportsheetItem;

/**
 * 入库单详情 Service
 * 
 * @author 
 * @date 2018-11-12
 */
public interface ImportsheetItemService {

    /**
     * 根据id查询入库单详情
     * 
     * @param id 自增主键
     * @return 入库单详情
     */
    ImportsheetItem getImportsheetItemById( Integer id );


    /**
     * 保存入库单详情
     * 
     * @param importsheetItem 入库单详情
     * @return 操作影响行数
     */
    int insertImportsheetItem(ImportsheetItem importsheetItem) throws Exception;

    /**
     * 局部更新入库单详情
     * 
     * @param importsheetItem 入库单详情
     * @return 操作影响行数
     */
    int updatePartImportsheetItem(ImportsheetItem importsheetItem) throws Exception;

    /**
     * 根据主键删除入库单详情
     * 
     * @param id 自增主键
     * @return 操作影响行数
     */
    int deleteImportsheetItem( Integer id );

}
