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

import com.jr.erp.base.controller.FileUploadOperator;

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
     * 统一上传接口
     * imageUpload        
     * @param @param file
     * @param @param modules
     * @param @param needCompress
     * @param @param paramMap
     * @param @return
     * @param @throws Exception     
     * @return FileUploadOperater
     * @Exception 异常对象
     */
    FileUploadOperator imageUpload(MultipartFile file, int modules) throws Exception;
    
    
    /**    
     * 上传商品图片，使用源文件名
     * goodsImageUpload 
     * @param @param file
     * @param @param companyNo
     * @param @param pCatalog
     * @param @return
     * @param @throws Exception     
     * @return FileUploadOperator
     * @Exception 异常对象
    */
    FileUploadOperator goodsImageUpload(MultipartFile file, String companyNo, String pCatalog) throws Exception;
    
    /**    
     * 上传礼品图片，使用源文件名
     * giftImageUpload 
     * @param @param file
     * @param @param companyNo
     * @param @param id
     * @param @return
     * @param @throws Exception     
     * @return FileUploadOperator
     * @Exception 异常对象
    */
    FileUploadOperator giftImageUpload(MultipartFile file, String companyNo, Integer id) throws Exception;

    /**
     * excel文件上传
     * @param @param file
     * @param @param companyNo  公司编号
     * @param @return
     * @param @throws Exception     
     * @return FileUploadOperater
     * @Exception 异常对象
     */
    List<String[][]> excelFileUpload(MultipartFile file,String companyNo) throws Exception;


    /**    
     * LogoImageUpload(Logo上传)    
     * @param @param file
     * @param @param companyNo
     * @param @return
     * @param @throws Exception     
     * @return FileUploadOperator
     * @Exception 异常对象
    */
    FileUploadOperator LogoImageUpload(MultipartFile file, String companyNo) throws Exception;

}