package com.jr.erp.base.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.jr.erp.base.exception.ServiceAccessException;


/**     
 * 类名称：ExcelUtils    
 * 类描述： excel读写工具   
 * 创建人：admin    
 * 创建时间：2018年10月26日 下午6:29:08    
 * 修改人：admin    
 * 修改时间：2018年10月26日 下午6:29:08    
 * 修改备注：    
 * @version  1.0    
 */
public class ExcelUtils
{
    private static Logger logger = LoggerFactory.getLogger(ExcelUtils.class);
    
    /**    
     * readExcel(这里用一句话描述这个方法的作用)    
     * 解析excel行，转换成字符串列表       
     * @param @param file
     * @param @return     
     * @return List<List<String>>
     * @Exception 异常对象
    */
    public static List<List<String>> readExcel(File file)
    {
        InputStream inputStream = null;
        ExcelListener eventListener = new ExcelListener();
        try
        {
            if(!file.exists())
            {
                throw new ServiceAccessException("文件不存在");
            }
            inputStream = new FileInputStream(file);
            ExcelTypeEnum fileType = getFileType(file);
            if (fileType == null)
            {
                throw new ServiceAccessException("文件类型错误");
            }
            ExcelReader excelReader = new ExcelReader(inputStream, fileType, null, eventListener, true);
            Sheet sheet = new Sheet(1);
            excelReader.read(sheet);
        } catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        } catch (Exception e)
        {
            if (e instanceof ExcelAnalysisException && StringUtils.equals(e.getMessage(), "interrupt error"))
            {
                logger.warn("Excel解析结果：部分行未解析");
            } else
            {
                logger.error("Excel解析失败", e);
                throw new ServiceAccessException("解析文件失败");
            }
        }
        return eventListener.getDatas();
    }
    
    /**    
     * getFileType(这里用一句话描述这个方法的作用)    
     * 获取文件类型       
     * @param @param file
     * @param @return     
     * @return ExcelTypeEnum
     * @Exception 异常对象
    */
    private static ExcelTypeEnum getFileType(File file)
    {
        if (StringUtils.endsWithIgnoreCase(file.getName(), ".xlsx"))
        {
            return ExcelTypeEnum.XLSX;
        } else if (StringUtils.endsWithIgnoreCase(file.getName(), ".xls"))
        {
            return ExcelTypeEnum.XLS;
        }
        return null;
    }
    
    public static void writeExcel(OutputStream out,List<List<String>> data){
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLS);
        //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
        Sheet sheet = new Sheet(1);
        writer.write0(data, sheet);
        writer.finish();
    }
    
}
