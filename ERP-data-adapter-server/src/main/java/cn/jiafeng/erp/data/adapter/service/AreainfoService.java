package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.Areainfo;
import cn.jiafeng.erp.data.adapter.model.dto.AreainfoDto;

/**
 * 系统区域，在后台维护，不在前台显示，用于用户数据权限的控制 Service
 * 
 * @author 
 * @date 2018-11-12
 */
public interface AreainfoService {

    /**
     * 根据id查询系统区域，在后台维护，不在前台显示，用于用户数据权限的控制
     * 
     * @param id 自增主键
     * @return 系统区域，在后台维护，不在前台显示，用于用户数据权限的控制
     */
    Areainfo getAreainfoById( Integer id );


    /**
     * 保存系统区域，在后台维护，不在前台显示，用于用户数据权限的控制
     * 
     * @param areainfo 系统区域，在后台维护，不在前台显示，用于用户数据权限的控制
     * @return 操作影响行数
     */
    int insertAreainfo(Areainfo areainfo) throws Exception;

    /**
     * 局部更新系统区域，在后台维护，不在前台显示，用于用户数据权限的控制
     * 
     * @param areainfo 系统区域，在后台维护，不在前台显示，用于用户数据权限的控制
     * @return 操作影响行数
     */
    int updatePartAreainfo(Areainfo areainfo) throws Exception;

    /**
     * 根据主键删除系统区域，在后台维护，不在前台显示，用于用户数据权限的控制
     * 
     * @param id 自增主键
     * @return 操作影响行数
     */
    int deleteAreainfo( Integer id );

    
    /**
     * 获取门店
     * @param companyNo
     * @return
     */
    List<AreainfoDto> getArea(String companyNo) throws Exception;
}
