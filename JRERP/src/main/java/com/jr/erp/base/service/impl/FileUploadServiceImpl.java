/*
 * @文件名： FileUploadServiceImpl.java 
 * @创建人: Administrator
 * @创建时间: 2014-8-29   
 * @包名： com.fangle.dacits.api.mobileapp.service.impl
 * @版本： 1.0
 * 版权所有 © 聚能科技有限公司 
 * 描述:
*/
package com.jr.erp.base.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jr.erp.base.exception.ServiceAccessException;
import com.jr.erp.base.utils.ExcelUtils;
import com.jr.erp.base.utils.JodaUtils;

/**     
 * 类名称：FileUploadServiceImpl    
 * 类描述：    
 * 创建人：Administrator    
 * 创建时间：2014-8-29 下午12:14:52    
 * 修改人：Administrator    
 * 修改时间：2014-8-29 下午12:14:52    
 * 修改备注：    
 * @version  1.0    
 */
@Service("fileUploadService")
public class FileUploadServiceImpl implements IFileUploadService 
{
    private Logger logger = LoggerFactory.getLogger(FileUploadServiceImpl.class);
    /**
     * 获得文件类型
     * getExtension(这里用一句话描述这个方法的作用)    
     * @param @param s
     * @param @return     
     * @return String
     * @Exception 异常对象
     */
    public static String getExtension(String s) {
        String ext = null;
        int i = s.lastIndexOf('.');
        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1);
        }
        return ext;
    }
        

    /**  
     * @see com.jn.erp.common.base.service.IFileUploadService#excelFileUpload(org.springframework.web.multipart.MultipartFile, int)    
     */
    public List<List<String>> excelFileUpload(MultipartFile file,String companyNo) throws Exception
    {
        List<List<String>> resultList = null;

        //UUID的文件名称
        String fileName = DigestUtils.md5Hex((JodaUtils.getFullDate()).getBytes()) + "." + getExtension(file.getOriginalFilename());
        String relativePath = JodaUtils.getShortDate();
        String absolutePath = "F:\\"+ companyNo + File.separator + relativePath;//全路径
        //文件的保存路径
        File targetFile = new File(absolutePath, fileName);
        if (!targetFile.getParentFile().exists())
        {
            targetFile.getParentFile().mkdirs();
        }
        try
        {
            // 临时保存文件，将文件解析成字符串数组
            file.transferTo(targetFile);
            resultList = ExcelUtils.readExcel(targetFile);
        } catch (Exception e)
        {
            logger.error("文件上传错误", e);
            throw e;
        }
        if(false)
        {
            targetFile.delete();
        }
        return resultList;
    }
    
}
