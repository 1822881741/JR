package com.maven.web.util;
import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.PrimitiveTypeWrapper;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * @author wangmengjun
 *
 */
public class BaseMapperGeneratorPlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}

	/**
	 * 生成dao
	 */
	@Override
	public boolean clientGenerated(Interface interfaze,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		/**
		 * 主键默认采用java.lang.Integer
		 */
		FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("BaseMapper<"
				+ introspectedTable.getBaseRecordType()+">");
		FullyQualifiedJavaType imp = new FullyQualifiedJavaType(
				"com.jr.erp.base.mybatis.BaseMapper");
		/**
		 * 添加 extends MybatisBaseMapper
		 */
		interfaze.addSuperInterface(fqjt);

		/**
		 * 添加import my.mabatis.example.base.MybatisBaseMapper;
		 */
		interfaze.addImportedType(imp);
		/**
		 * 方法不需要
		 */
		interfaze.getMethods().clear();
		interfaze.getAnnotations().clear();
		return true;
	}

	/**
     * 为每个Example类添加limit和offset属性已经set、get方法
     */
    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

        PrimitiveTypeWrapper integerWrapper = FullyQualifiedJavaType.getIntInstance().getPrimitiveTypeWrapper();

        Field page = new Field();
        page.setName("page");
        page.setVisibility(JavaVisibility.PRIVATE);
        page.setType(integerWrapper);
        topLevelClass.addField(page);

        Method setPage = new Method();
        setPage.setVisibility(JavaVisibility.PUBLIC);
        setPage.setName("setPage");
        setPage.addParameter(new Parameter(integerWrapper, "page"));
        setPage.addBodyLine("this.page = page;");
        topLevelClass.addMethod(setPage);

        Method getPage = new Method();
        getPage.setVisibility(JavaVisibility.PUBLIC);
        getPage.setReturnType(integerWrapper);
        getPage.setName("getPage");
        getPage.addBodyLine("return page;");
        topLevelClass.addMethod(getPage);

        Field limit = new Field();
        limit.setName("limit");
        limit.setVisibility(JavaVisibility.PRIVATE);
        limit.setType(integerWrapper);
        topLevelClass.addField(limit);

        Method setLimit = new Method();
        setLimit.setVisibility(JavaVisibility.PUBLIC);
        setLimit.setName("setLimit");
        setLimit.addParameter(new Parameter(integerWrapper, "limit"));
        setLimit.addBodyLine("this.limit = limit;");
        topLevelClass.addMethod(setLimit);

        Method getLimit = new Method();
        getLimit.setVisibility(JavaVisibility.PUBLIC);
        getLimit.setReturnType(integerWrapper);
        getLimit.setName("getLimit");
        getLimit.addBodyLine("return limit;");
        topLevelClass.addMethod(getLimit);

        return true;
    }

    /**
     * 为Mapper.xml的selectByExample添加limit
     */
    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element,
            IntrospectedTable introspectedTable) {

        XmlElement ifLimitNotNullElement = new XmlElement("if");
        ifLimitNotNullElement.addAttribute(new Attribute("test", "page != null"));

        XmlElement ifOffsetNotNullElement = new XmlElement("if");
        ifOffsetNotNullElement.addAttribute(new Attribute("test", "limit != null"));
        ifOffsetNotNullElement.addElement(new TextElement("limit ${(page-1)*limit}, ${limit}"));
        ifLimitNotNullElement.addElement(ifOffsetNotNullElement);

//        XmlElement ifOffsetNullElement = new XmlElement("if");
//        ifOffsetNullElement.addAttribute(new Attribute("test", "limit == null"));
//        ifOffsetNullElement.addElement(new TextElement("limit ${limit}"));
//        ifLimitNotNullElement.addElement(ifOffsetNullElement);

        element.addElement(ifLimitNotNullElement);

        return true;
    }
    
    
}