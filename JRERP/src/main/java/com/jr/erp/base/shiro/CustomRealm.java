package com.jr.erp.base.shiro;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.sys.entity.SysStore;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.entity.SysUserExample;
import com.jr.erp.sys.service.ISysUserService;

public class CustomRealm extends AuthorizingRealm {

	@Autowired
    private ISysUserService sysUserService;
    
    /**
     * 认证
     */
	@Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 获取用户名
        System.out.println("==================");
        UsernamePasswordToken upToken = (UsernamePasswordToken)token;
        // 通过用户名获取用户对象
        SysUserExample example =new SysUserExample();
        example.createCriteria().andLoginNoEqualTo(upToken.getUsername());
//        example.createCriteria().andPasswordEqualTo(upToken.getPassword().toString());
//        sysUserService.selectByPrimaryKey("1131");
//        List<BaseEntity> result = sysUserService.selectByExample(example);
        
        SysUser user =  (SysUser) sysUserService.selectByPrimaryKey(1131);
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getPassword(),user.getLoginNo());;
        
        return info;
    }
    
    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        User user = (User) principals.getPrimaryPrincipal();
    	System.out.println("========+++++++==========");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        
        // （目录+菜单+按钮，用于后端权限判断）
//        List<Permission> permissionList = user.getPermissionList();
//        
//        for (Permission permission : permissionList) {
//            if (StringUtil.isNotEmpty(permission.getCode())) {
//                info.addStringPermission(permission.getCode());
//            }
//        }
        
        return info;
    }
}
