package com.jr.erp.base.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.jr.erp.sys.entity.SysStore;

public class CustomRealm extends AuthorizingRealm {

//	@Autowired
//    private UserService userService;
//    
//    @Autowired
//    private PermissionService permissionService;
    
    /**
     * 认证
     */
	@Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 获取用户名
        System.out.println("==================");
        // 通过用户名获取用户对象
//        User user = this.userService.findUserByUserName(userName);
//        
//        if (user == null) {
//            return null;
//        }
        
        // 通过 userId 获取该用户拥有的所有权限，返回值根据自己需求编写，并非固定值。
//        Map<String,List<Permission>> permissionMap = this.permissionService.getPermissionMapByUserId(user.getId());
//        
//        // （目录+菜单，分层级，用于前端 jsp 遍历）
//        user.setMenuList(permissionMap.get("menuList"));
//        // （目录+菜单+按钮，用于后端权限判断）
//        user.setPermissionList(permissionMap.get("permissionList"));
        
//        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(null,null,null);
        SysStore store = new SysStore();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(store,"123456","长桑");;
        
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
