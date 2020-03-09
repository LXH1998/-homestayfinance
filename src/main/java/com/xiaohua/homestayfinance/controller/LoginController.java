package com.xiaohua.homestayfinance.controller;

import com.xiaohua.homestayfinance.entity.ResponseWrapper;
import com.xiaohua.homestayfinance.entity.User;
import com.xiaohua.homestayfinance.service.LoginService;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LoginController
 * @author:xiaoyi
 * @date: 2019/9/19 14:13
 * @Description : 跳转主页
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService service;
    /**
     * @Author xiaoyi
     * @Return
     * @Date 2019/9/12 17:22
     * @param
     * @Description 跳转主页
     */
    @RequestMapping("goIndex")
    public String goIndex(){
        return "index";
    }


    /**
     * @Author xiaoyi
     * @Return
     * @Date 2019/9/12 17:22
     * @param
     * @Description 跳转主页
     */
    @RequestMapping("gologin")
    public String login(){
        return "login";
    }

    /**
    * @Author xiaoyi
    * @Return
    * @Date 2019/9/26 11:48
    * @param
    * @Description 登录验证
    */
    @RequestMapping("validation")
    @ResponseBody
    public Map validation(String name, String password){
        Map map = new HashMap();
        //shiro编写认证操作
        //1、获取subject
        Subject subject = SecurityUtils.getSubject();
        //2、封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(name,password);
        //3、执行登录方法  通过是否报错来判断登录是否成功
        try {
            subject.login(token);
            map.put("isLogin","true");
        }catch (UnknownAccountException  e)
        {
            map.put("isLogin","false");
            map.put("msg","用户名不存在！");
        }catch (IncorrectCredentialsException e){
            map.put("isLogin","false");
            map.put("msg","密码错误！");
        }

//        User user  = new User();
//        user.setUser_Password(password);
//        user.setUser_Account(name);
//        boolean result =service.loginUser(user);
//
//        if (result){
//            map.put("isLogin","");
//            map.put("msg","用户名不存在");
//            return  map;
//        }
//        map.put("msg","false");
        return  map;
    }

    /**
    * @Author xiaoyi
    * @Return
    * @Date 2019/9/27 11:47
    * @param
    * @Description 登出
    */
    @RequestMapping("loginOut")
    @ResponseBody
    public ResponseWrapper loginOut(){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)ra).getRequest();
        HttpSession session = request.getSession();
        session.invalidate();
        return ResponseWrapper.loginOutSuccess();
    }
    
}


