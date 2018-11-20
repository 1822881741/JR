package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Importsheet;
import cn.jiafeng.erp.data.adapter.model.dto.AddResult;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.ImportsheetDto;

/**
 * 入库单 Service
 * 
 * @author 
 * @date 2018-11-12
 */
public interface ImportsheetService {

    /**
     * 根据id查询入库单
     * 
     * @param id 自增主键
     * @return 入库单
     */
    Importsheet getImportsheetById( Integer id );


    /**
     * 保存入库单
     * 
     * @param importsheet 入库单
     * @return 操作影响行数
     */
    List<AddResult> insertImportsheet(ImportsheetDto models) throws Exception;

    /**
     * 局部更新入库单
     * 
     * @param importsheet 入库单
     * @return 操作影响行数
     */
    int updatePartImportsheet(Importsheet importsheet) throws Exception;

    /**
     * 根据主键删除入库单
     * 
     * @param id 自增主键
     * @return 操作影响行数
     */
    int deleteImportsheet( Integer id );
    
    void delByIds(BaseParamters param) throws Exception;

}
