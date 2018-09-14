package com.maven.web.util;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
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
		FullyQualifiedJavaType imp = new FullyQualifiedJavaType("com.jr.erp.base.mybatis.BaseMapper");
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

        topLevelClass.addImportedType("com.jr.erp.base.mybatis.BaseExample");
        topLevelClass.setSuperClass("BaseExample");

        List<Field> list = topLevelClass.getFields();
        Iterator<Field> iter = list.iterator();
        while (iter.hasNext())
        {
            Field field = iter.next();
            if (StringUtils.equals(field.getName(), "orderByClause")
                    || StringUtils.equals(field.getName(), "distinct"))
            {
                iter.remove();
            }

        }
        List<Method> list2 = topLevelClass.getMethods();
        Iterator<Method> iter2 = list2.iterator();
        while (iter2.hasNext())
        {
            Method field = iter2.next();
            if (StringUtils.equals(field.getName(), "setOrderByClause")
                    || StringUtils.equals(field.getName(), "getOrderByClause")
                    ||StringUtils.equals(field.getName(), "setDistinct")
                    ||StringUtils.equals(field.getName(), "isDistinct")
                    )
            {
                iter2.remove();
            }
        }
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
    @Override
    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element,
            IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean clientInsertSelectiveMethodGenerated(Method method,
            Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean clientInsertSelectiveMethodGenerated(Method method,
            TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
}