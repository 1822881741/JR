package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.Areainfo;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 系统区域，在后台维护，不在前台显示，用于用户数据权限的控制 Dao
 * 
 * @author
 * @date 2018-11-12
 */
@Repository
public interface AreainfoMapper {

	Areainfo getById(@Param("id") Integer id);

	int insert(Areainfo areainfo);

	int insertBatch(List<Areainfo> areainfos);

	int update(Areainfo areainfo);

	int updatePart(Areainfo areainfo);

	int deleteByPk(@Param("id") Integer id);

	List<Areainfo> getAreaByCode(@Param("areaCode") String areaCode);
}
