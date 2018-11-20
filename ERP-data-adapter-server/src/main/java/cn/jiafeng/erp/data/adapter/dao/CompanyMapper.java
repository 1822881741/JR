
package cn.jiafeng.erp.data.adapter.dao;

import cn.jiafeng.erp.data.adapter.dao.entity.Company;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 公司客户 Dao
 * 
 * @author
 * @date 2018-11-14
 */
@Repository
public interface CompanyMapper {

	Company getById(@Param("id") Integer id);

	int insert(Company company);

	int insertBatch(List<Company> companys);

	int update(Company company);

	int updatePart(Company company);

	int deleteByPk(@Param("id") Integer id);

	Company getByCompanyNo(@Param("companyNo") String companyNo);
}
