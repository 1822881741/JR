/*
 * @文件名： BaseEntity.java 
 * @创建人: zyl
 * @创建时间: 2014-5-7 
 * @包名： com.jn.erp.system.dao.entity
 * @版本： 1.0
 * 版权所有 © 聚能科技有限公司 
 * 描述:
 */
package com.jr.erp.base.mybatis;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * 类名称：BaseEntity 
 * 类描述：Base实体 创建人：zyl 
 * 创建时间：2014-5-7 下午5:00:02 修改人：zyl
 * 修改时间：2014-5-7 下午5:00:02 修改备注：
 * 
 * @version 1.0r
 */
@SuppressWarnings("serial")
public class BaseEntity implements Serializable
{
    /**
     * id:对象id
     * 
     * @since Ver 1.1
     */
    protected Integer id;
    
    /**
     * 公司编码
     */
    protected String companyNo;
    
    /**
     * 数据生成时间
     */
    private Date createTime;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }
    
    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    /**    
     * companyNo    
     * @return  the companyNo    
     * @since   CodingExample Ver(编码范例查看) 1.0    
     */
    
    public String getCompanyNo()
    {
        return companyNo;
    }

    /**    
     * @param companyNo the companyNo to set    
     */
    public void setCompanyNo(String companyNo)
    {
        this.companyNo = companyNo;
    }

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
