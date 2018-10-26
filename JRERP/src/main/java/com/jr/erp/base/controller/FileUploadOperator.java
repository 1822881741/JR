/**   
* @Title: ImgUploadOperater.java 
* @author 你的名字   
* @date 2013-11-7 下午1:56:07 
* @version V1.0   
*/
package com.jr.erp.base.controller;

import java.util.Map;

/** 
* @ClassName: ImgUploadOperater 
* @author 你的名字 
* @date 2013-11-7 下午1:56:07 
*  
*/
public class FileUploadOperator {

	/** 
	* 图片的原始名称
	*/
	private String oriName;
	
	/** 
    * 图片名称
    */
    private String fileName;
    
	/** 
	* 图片的名称(全路径名称)
	*/
	private String fileUrl;
	
	/**
     * 文件类型
     */
    private String fileType;
    
	/** 
	* 图片大小
	*/
	private Long imgSize;
	/** 
	*  处理信息
	*/
	private String message;
	
	/**
	 * 处理结果0：未知错误
	 */
	public static int OPERATER_ERROR_UNKNOW = 0;
	/**
	 * 1：文件类型错误
	 */
	public static int OPERATER_ERROR_FILETYPE = 1;
	
	/**
	 * 2：文件大小错误
	 */
	public static int OPERATER_ERROR_FILESIZE = 2;
	
	/**
	 * 100：处理成功
	 */
	public static int OPERATER_SUCCESS = 100;
	
	/**
	 * 200: 处理成功，等待下批文件数据，用于分割文件上传
	 */
	public static int OPERATER_WAIT = 200;
	
	/** 
	*  处理结果0：未知错误；1：文件类型错误，2：文件大小错误，  100：处理成功 ,  200 : 处理成功，等待下批文件数据
	*/
	private int status;
	
	
	//---------------------回填前台元素使用------------------------------------------------
	/**
	 * 新的图片路径返回后给那个隐藏域接收
	 */
	private String callBackFilePathImputObjId;
	
	/**
	 * 新的图片回显到的img对象id
	 */
	private String callBackShowImgObjId;

	/**    
	 * 特殊业务处理结果封装对象    
	 */    
	private Map<String,Object> processResult;
	public String getOriName() {
		return oriName;
	}

	public void setOriName(String oriName) {
		this.oriName = oriName;
	}

	public Long getImgSize() {
		return imgSize;
	}

	public void setImgSize(Long imgSize) {
		this.imgSize = imgSize;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

    /**    
     * fileName    
     * @return  the fileName    
     * @since   CodingExample Ver(编码范例查看) 1.0    
     */
    
    public String getFileName()
    {
        return fileName;
    }

    /**    
     * @param fileName the fileName to set    
     */
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    /**    
     * callBackFilePathImputObjId    
     * @return  the callBackFilePathImputObjId    
     * @since   CodingExample Ver(编码范例查看) 1.0    
     */
    
    public String getCallBackFilePathImputObjId()
    {
        return callBackFilePathImputObjId;
    }

    /**    
     * @param callBackFilePathImputObjId the callBackFilePathImputObjId to set    
     */
    public void setCallBackFilePathImputObjId(String callBackFilePathImputObjId)
    {
        this.callBackFilePathImputObjId = callBackFilePathImputObjId;
    }

    /**    
     * callBackShowImgObjId    
     * @return  the callBackShowImgObjId    
     * @since   CodingExample Ver(编码范例查看) 1.0    
     */
    
    public String getCallBackShowImgObjId()
    {
        return callBackShowImgObjId;
    }

    /**    
     * @param callBackShowImgObjId the callBackShowImgObjId to set    
     */
    public void setCallBackShowImgObjId(String callBackShowImgObjId)
    {
        this.callBackShowImgObjId = callBackShowImgObjId;
    }

    /**    
     * fileType    
     * @return  the fileType    
     * @since   CodingExample Ver(编码范例查看) 1.0    
     */
    
    public String getFileType()
    {
        return fileType;
    }

    /**    
     * @param fileType the fileType to set    
     */
    public void setFileType(String fileType)
    {
        this.fileType = fileType;
    }

    public void setProcessResult(Map<String,Object> processResult)
    {
        this.processResult = processResult;
    }

    public Map<String,Object> getProcessResult()
    {
        return processResult;
    }
}
