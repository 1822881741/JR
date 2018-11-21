package com.jr.erp.base.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.jr.erp.sys.entity.SysUser;

/**
 * shiro 工具类
 * @author 高小虎
 *
 */
public class ShiroUtils {
	/**  加密算法 */
	public final static String hashAlgorithmName = "SHA-256";
	/**  循环次数 */
	public final static int hashIterations = 16;

	public static String sha256(String password, String salt) {
		return new SimpleHash(hashAlgorithmName, password, salt, hashIterations).toString();
	}

	public static Session getSession() {
		return SecurityUtils.getSubject().getSession();
	}

	public static Subject getSubject() {
		return SecurityUtils.getSubject();
	}

	public static SysUser getSysUser() {
		return (SysUser)SecurityUtils.getSubject().getPrincipal();
	}

	public static Integer getUserId() {
		return getSysUser().getId();
	}
	
	public static void setSessionAttribute(Object key, Object value) {
		getSession().setAttribute(key, value);
	}

	public static Object getSessionAttribute(Object key) {
		return getSession().getAttribute(key);
	}

	public static boolean isLogin() {
		return SecurityUtils.getSubject().getPrincipal() != null;
	}

	public static void logout() {
		SecurityUtils.getSubject().logout();
	}
	
//	public static String getKaptcha(String key) {
//		Object kaptcha = getSessionAttribute(key);
//		if(kaptcha == null){
//			throw new RRException("验证码已失效");
//		}
//		getSession().removeAttribute(key);
//		return kaptcha.toString();
//	}

	public static String getCompanyNo(){
	    return getSysUser().getCompanyNo();
	}
	
	public static String getUserAreaCode(){
        return getSysUser().getAreaCode();
    }
	
	public static String getPrefix()
	{
	    return getSysUser().getUserSheetNoPrefix();
	}

    public static String getUserName()
    {
        return getSysUser().getRealName();
    }
}
