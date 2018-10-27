/*
 * @文件名： IFileUploadService.java 
 * @创建人: Administrator
 * @创建时间: 2014-8-29   
 * @包名： com.fangle.dacits.api.mobileapp.service.impl
 * @版本： 1.0
 * 版权所有 © 聚能科技有限公司 
 * 描述:
 */
package com.jr.erp.base.service.impl;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


/**     
 * 类名称：IFileUploadService    
 * 类描述：    
 * 创建人：Administrator    
 * 创建时间：2014-8-29 下午02:59:13    
 * 修改人：Administrator    
 * 修改时间：2014-8-29 下午02:59:13    
 * 修改备注：    
 * @version  1.0    
 */
public interface IFileUploadService
{

    /**
     * excel文件上传
     * @param @param file
     * @param @param companyNo  公司编号
     * @param @return
     * @param @throws Exception     
     * @return FileUploadOperater
     * @Exception 异常对象
     */
    List<List<String>> excelFileUpload(MultipartFile file,String companyNo) throws Exception;

}