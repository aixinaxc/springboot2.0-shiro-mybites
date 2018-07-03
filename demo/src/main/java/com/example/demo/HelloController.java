package com.example.demo;


import com.example.demo.user.service.UserService;
import com.example.demo.weixin.BaseApi;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@Controller
public class HelloController {
    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    UserService userService;

    @Autowired
    BaseApi baseApi;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        //BaseApi baseApi = new BaseApi();
        String aT = baseApi.getAccessToken();
        logger.error("Hello Spring Boot!");
        return "Hello Spring Boot!" + aT;
    }



    @RequestMapping("/hello1")
    @ResponseBody
    @RequiresPermissions("/hello1")
    public String hello1() {
        logger.error("Hello Spring Boot!");
        return "Hello1 Spring Boot!1111111";
    }



    @RequestMapping("/home/users")
    @ResponseBody
    @RequiresPermissions("/home/users")
    public String home() {
        logger.error("home");
        return "home";
    }


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    //post登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody Map map){
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                map.get("username").toString(),
                map.get("password").toString());
        //进行验证，这里可以捕获异常，然后返回对应信息
        subject.login(usernamePasswordToken);
        return "login";
    }


}
