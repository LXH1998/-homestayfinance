package com.xiaohua.homestayfinance.shiro;

import com.xiaohua.homestayfinance.entity.User;
import com.xiaohua.homestayfinance.service.LoginService;
import com.xiaohua.homestayfinance.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 自定义Realm
 * @author langxiaohua
 * @version 1.0
 * @date 2020-02-28 21:00
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserService userService;
    //执行授权逻辑
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行授权逻辑");
        return null;
    }
    //执行认证逻辑
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
        System.out.println("执行认证逻辑");
        UsernamePasswordToken token = (UsernamePasswordToken)arg0;
        String userName = token.getUsername();
        User user = userService.selectUserByAccount(userName);
        String a = userService.toString();
        user.getUser_Id();

        if(user==null)
        {
            return null;
        }

        return new SimpleAuthenticationInfo("",token.getPassword(),"");
    }
}
