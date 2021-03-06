/**   
* @Title: ImgUploadController.java 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 你的名字   
* @date 2013-11-7 下午1:47:44 
* @version V1.0   
*/
package com.jr.erp.base.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.alibaba.fastjson.JSONObject;
import com.jr.erp.base.service.impl.IFileUploadService;
import com.jr.erp.base.shiro.ShiroUtils;


/** 
* @ClassName: ImgUploadController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 你的名字 
* @date 2013-11-7 下午1:47:44 
*  
*/
@Controller
@RequestMapping(value = "/upload")
public class FileUploadController
{
    /**
     * 文件上传服务
     */
    @Resource(name="fileUploadService")
    IFileUploadService fileUploadService;
    /**
     * 图片文件上传
     * upload(这里用一句话描述这个方法的作用)    
     * @param @param file
     * @param @param modules   文件所述的模块，用户给文件放到自己模块的目录中
     * @param @param request
     * @param @param model
     * @param @return
     * @param @throws Exception     
     * @return String
     * @Exception 异常对象
     */
    @ResponseBody
    @RequestMapping(value ={ "/imgUpload.do" })
    public void fileUpload(@RequestParam MultipartFile file,String folder, HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {
        FileUploadOperator operator=null;
        String companyNo = ShiroUtils.getSysUser().getCompanyNo();
        try
        {
            operator = new FileUploadOperator();
            operator.setFileName("success");
            fileUploadService.excelFileUpload(file, companyNo);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        PrintWriter writer = null;
        writer = response.getWriter();
        JSONObject json = new JSONObject();
        json.put("success", false);
        json.put("filename", "fileName");
        json.put("path", "path");
        json.put("fullName", "fullNam");
        writer.print(json);
        writer.flush();
        writer.close();
    }

}
