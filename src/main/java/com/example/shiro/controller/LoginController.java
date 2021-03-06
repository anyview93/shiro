package com.example.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shiro.entity.User;

/**
 * @author shizhiguo
 * @version 1.0.
 * @Description
 * @Date 2020/1/15
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public Object login(User user){
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
//        try {
            //进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(token);
//            subject.checkRole("admin");
//            subject.checkPermissions("query", "add");
//        } catch (AuthenticationException e) {
//            e.printStackTrace();
//            return "账号或密码错误！";
//        } catch (AuthorizationException e) {
//            e.printStackTrace();
//            return "没有权限";
//        }
        return "login success";
    }
    //注解验角色和权限
    @RequiresRoles("admin")
    @RequiresPermissions("add")
    @RequestMapping("/index")
    public String index() {
        return "index!";
    }

    @GetMapping("/err")
    public Object error(){
        return "错误结果";
    }
}
