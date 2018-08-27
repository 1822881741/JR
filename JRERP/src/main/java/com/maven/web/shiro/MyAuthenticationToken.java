package com.maven.web.shiro;  
  
import org.apache.shiro.authc.UsernamePasswordToken;  
  
/** 
 * 重新token，对用户名的认证改为手机号 
 * @author Administrator 
 * 
 */  
public class MyAuthenticationToken extends UsernamePasswordToken{  
  
    private static final long serialVersionUID = 1425855488092920451L;  
      
    /** 手机号 */  
    private String phone;  
  
    public MyAuthenticationToken(String phone, String password, boolean rememberMe, String host) {  
        super(null, password, rememberMe, host);  
        this.phone = phone;  
    }  
  
    /** 默认是返回用户名，改写返回手机号 */  
    @Override  
    public Object getPrincipal() {  
        return phone;  
    }  
  
    @Override  
    public void clear() {  
        super.clear();  
        phone = null;  
    }  
  
    public String getPhone() {  
        return phone;  
    }  
  
    public void setPhone(String phone) {  
        this.phone = phone;  
    }  
      
      
  
}  