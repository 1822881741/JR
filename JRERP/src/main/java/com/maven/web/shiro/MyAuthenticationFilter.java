package com.maven.web.shiro;  
  
import javax.servlet.ServletRequest;  
import javax.servlet.ServletResponse;  
  
import org.apache.shiro.authc.AuthenticationToken;  
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;  
import org.apache.shiro.web.util.WebUtils;  
  
/** 
 * 重写token认证 
 * @author Administrator 
 * 
 */  
public class MyAuthenticationFilter extends FormAuthenticationFilter{  
  
    public static final String DEFAULT_PHONE_PARAM = "phone";  
      
    private String phoneParam = DEFAULT_PHONE_PARAM;  
      
    public MyAuthenticationFilter(){  
        setFailureKeyAttribute(DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);  
    }  
      
    @Override  
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {  
        String phone = getPhone(request);  
        String password = getPassword(request);  
        boolean rememberMe = isRememberMe(request);  
        String host = getHost(request);   
          
        return new com.maven.web.shiro.MyAuthenticationToken(phone,password,rememberMe,host);  
    }  
  
    public String getPhoneParam() {  
        return phoneParam;  
    }  
  
    public void setPhoneParam(String phoneParam) {  
        this.phoneParam = phoneParam;  
    }  
  
    protected String getPhone(ServletRequest request) {  
        return WebUtils.getCleanParam(request, getPhoneParam());  
    }   
      
}  