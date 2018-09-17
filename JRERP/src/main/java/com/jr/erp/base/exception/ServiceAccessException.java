/*
 * @文件名： ServiceAccessException.java 
 * @创建人: zyl
 * @创建时间: 2014-4-23   
 * @包名： com.jn.erp.common.exception
 * @版本： 1.0
 * 版权所有 © 聚能科技有限公司 
 * 描述:
*/
package com.jr.erp.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**     
 * 类名称：ServiceAccessException    
 * 类描述：     业务访问异常
 * 创建人：zyl    
 * 创建时间：2014-4-23 上午9:22:35    
 * @version  1.0    
 */
public class ServiceAccessException extends RuntimeException
{

    private static final Logger log = LoggerFactory.getLogger(ServiceAccessException.class);
    private String errNo;

    private String errMsg;
    /**
     * 
     */
    private static final long serialVersionUID = -5057627653664555688L;

    public ServiceAccessException(String message) {
        super(message);
        log.error(message);
    }

    public ServiceAccessException(String message, Throwable t) {
        super(message, t);
        log.error(message, t);
    }

    public ServiceAccessException(Throwable t) {
        super(t);
        log.error("业务层错误",t);
    }
    public ServiceAccessException(String errNo,String errMsg){
        super(errMsg);
        this.errMsg = errMsg;
        this.errNo = errNo;
    }
    public String getErrNo() {
        return errNo;
    }

    public void setErrNo(String errNo) {
        this.errNo = errNo;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
