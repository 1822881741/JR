package com.jr.erp.base.mybatis;

import java.util.List;
import java.util.Map;

import com.jr.erp.base.utils.RetPage;

public interface IBaseService <T extends BaseEntity>{

	T selectByPrimaryKey(Integer key);

	Integer insert(T record);

	List<T> selectByExample(BaseExample criteria);
	
	RetPage selectPage(BaseExample criteria);
	
	Long countByExample(BaseExample criteria);
	
	Integer deleteByPrimaryKey(Integer key);

	void merge(T record);
	
	void updateByPrimaryKey(T t);
	
    void updateByPrimaryKeySelective(T t);
    
    void updateByExampleSelective(Map t);
    
    void deleteByExample(Object example);
    
    String selectMaxBillNo(String tableName,String companyNo,String prefix);
    
    String getBillCanEdit(String tableName,String companyNo,Integer id);
    
    boolean getBillExist(String tableName, String companyNo, Integer id);
}
