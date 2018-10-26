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
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jr.erp.base.controller.FileUploadOperator;

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
        
    //------------------------------文件上传-----------------------------------------------
    /**  
     * @see com.jn.erp.common.base.service.fangle.dacits.api.mobileapp.service.IFileUploadService#fileUpload(org.springframework.web.multipart.MultipartFile, int, java.util.Map)    
     */
    public FileUploadOperator imageUpload(MultipartFile file, int modules)
            throws Exception
    {
        // 服务的根路径，绝对路径
        String rootPath = WebRoot.getWebRoot();
        //获取tomcat的webapp路径
        File folderFile =new File(rootPath);
        rootPath = folderFile.getParent()+File.separator+"systemImage"+File.separator;
        FileUploadOperator operater = new FileUploadOperator();
        String fileName = org.apache.commons.codec.digest.DigestUtils.md5Hex((DateUtils.getStringDate()+ DateUtils.getRandom(9999)).getBytes())
                + "." + getExtension(file.getOriginalFilename());
        operater.setFileName(file.getOriginalFilename());
        operater.setOriName(file.getOriginalFilename());
        String _FileName = file.getOriginalFilename();
        operater.setFileType(_FileName.substring(_FileName.lastIndexOf(".") + 1, _FileName.length()));// 类型
        operater.setImgSize(file.getSize());// 大小
        String relativePath = "";
        {
            relativePath= getModuleFolder(modules);
        }
        operater.setFileUrl("systemImage"+File.separator+relativePath + File.separator + fileName);// 新的文件名称（从系统根目录下起的路径）
        String absolutePath = rootPath + relativePath;
        logger.info("rootPath:" + rootPath);
        logger.info("relativePath:" + relativePath);
        logger.info("absolutePath:" + absolutePath);
        File targetFile = new File(absolutePath, fileName);
        if (!targetFile.getParentFile().exists())
        {
            targetFile.getParentFile().mkdirs();
        }
        try
        {
            // 临时保存文件
            file.transferTo(targetFile);
            operater.setStatus(100);
        } catch (Exception e)
        {
            operater.setStatus(0);
            logger.error("文件上传错误", e);
        }
        return operater;
    }

    /**
     * 生成模块的图片路径
     * @param modules
     * @return
     */
    private String getModuleFolder(int modules)
    {
        switch (modules)
        {
        case Constance.MODULE_USER_PHOTO:
            return "userPhoto";
        default:
            return "default";
        }
    }

    /**  
     * @see com.jn.erp.common.base.service.IFileUploadService#excelFileUpload(org.springframework.web.multipart.MultipartFile, int)    
     */
    public List<String[][]> excelFileUpload(MultipartFile file,String companyNo) throws Exception
    {
        List<String[][]> resultList = null;

        //UUID的文件名称
        String fileName = DigestUtils.md5Hex((DateUtils.getStringDate()).getBytes()) + "."
                + getExtension(file.getOriginalFilename());
        String relativePath = DateUtils.getNowDateStr2();
        String absolutePath = SysPathUtils.getBaseSavePath()+Constance.RESOURCE_TYPE_EXCEl+File.separator+ companyNo + File.separator + relativePath;//全路径
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
            resultList = ExcelUtil.read(targetFile);
        } catch (Exception e)
        {
            logger.error("文件上传错误", e);
        }
        if(SysParamUtil.getParam("user.uoload.excel.autoDele", false))
        {
            targetFile.delete();
        }
        return resultList;
    }
    
    
    /**    
     * 
     * goodsImageUpload
     * @param @param file
     * @param @param companyNo
     * @param @param pCatalog
     * @param @return
     * @param @throws Exception     
     * @return FileUploadOperator
     * @Exception 异常对象
    */
    public FileUploadOperator goodsImageUpload(MultipartFile file, String companyNo, String pCatalog) throws Exception
    {
        FileUploadOperator operater = new FileUploadOperator();

        String fileNameNew =  org.apache.commons.codec.digest.DigestUtils.md5Hex((DateUtils.getStringDate()+ DateUtils.getRandom(9999)).getBytes())
                + "." + getExtension(file.getOriginalFilename());

        String filePath = companyNo + File.separator +Constance.IMG_TYPE_GOOGS+ File.separator + DateUtils.getNowDateStr2() + File.separator + pCatalog;
        String parentCatalogFullPath = SysPathUtils.getBaseSavePath()+Constance.RESOURCE_TYPE_IMG+File.separator +filePath;//全路径
        
        operater.setFileName(fileNameNew);
        operater.setOriName(file.getOriginalFilename());
        operater.setFileType(getExtension(file.getOriginalFilename()));// 类型
        operater.setImgSize(file.getSize());// 大小
        operater.setFileUrl(filePath + File.separator + fileNameNew);// 新的文件名称（从系统根目录下起的路径）

        // 文件的保存路径
        File targetFile = new File(parentCatalogFullPath, fileNameNew);
        if (!targetFile.getParentFile().exists())
        {
            targetFile.getParentFile().mkdirs();
        }
        try
        {
            // 临时保存文件，将文件解析成字符串数组
            file.transferTo(targetFile);
            operater.setStatus(100);
        } catch (Exception e)
        {
            operater.setStatus(0);
            logger.error("文件上传错误", e);
        }
        return operater;
    }

    /**  
     * @see com.jn.erp.common.base.service.IFileUploadService#giftImageUpload(org.springframework.web.multipart.MultipartFile, java.lang.String, java.lang.Integer)    
     */
    @Override
    public FileUploadOperator giftImageUpload(MultipartFile file, String companyNo, Integer id) throws Exception
    {
        FileUploadOperator operater = new FileUploadOperator();

        String fileName = DateUtils.getStringTodayB();
        
        

        String filePath = companyNo + File.separator + Constance.GIFT_TYPE_GOOGS + File.separator + id;
        String parentCatalogFullPath = SysPathUtils.getBaseSavePath() + Constance.RESOURCE_TYPE_IMG + File.separator
                + filePath;// 全路径

        operater.setFileName(file.getOriginalFilename());
        operater.setOriName(file.getOriginalFilename());
        operater.setFileType(getExtension(file.getOriginalFilename()));// 类型
        operater.setImgSize(file.getSize());// 大小
        operater.setFileUrl(filePath + File.separator + fileName);// 新的文件名称（从系统根目录下起的路径）

        // 文件的保存路径
        File targetFile = new File(parentCatalogFullPath, fileName);
        if (!targetFile.getParentFile().exists())
        {
            targetFile.getParentFile().mkdirs();
        }
        try
        {
            // 临时保存文件，将文件解析成字符串数组
            file.transferTo(targetFile);
            operater.setStatus(100);
        } catch (Exception e)
        {
            operater.setStatus(0);
            logger.error("文件上传错误", e);
        }
        return operater;
    }
    
    @Override
    public FileUploadOperator LogoImageUpload(MultipartFile file, String companyNo) throws Exception
    {
        FileUploadOperator operater = new FileUploadOperator();

        String fileName = DateUtils.getStringTodayB()+"."+getExtension(file.getOriginalFilename());
        String filePath = companyNo + File.separator + Constance.LOGO_TYPE_INDEX +File.separator  ;
        String parentCatalogFullPath = SysPathUtils.getBaseSavePath() + Constance.RESOURCE_TYPE_IMG + File.separator
                + filePath;// 全路径

        operater.setFileName(file.getOriginalFilename());
        operater.setOriName(file.getOriginalFilename());
        operater.setFileType(getExtension(file.getOriginalFilename()));// 类型
        operater.setImgSize(file.getSize());// 大小4
        operater.setFileUrl(filePath + fileName);// 新的文件名称（从系统根目录下起的路径）

        // 文件的保存路径
        File targetFile = new File(parentCatalogFullPath, fileName);
        if (!targetFile.getParentFile().exists())
        {
            targetFile.getParentFile().mkdirs();
        }
        try
        {
            // 临时保存文件，将文件解析成字符串数组
            file.transferTo(targetFile);
            operater.setStatus(100);
        } catch (Exception e)
        {
            operater.setStatus(0);
            logger.error("文件上传错误", e);
        }
        return operater;
    }
    
}
