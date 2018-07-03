package com.example.demo.weixin;

import com.example.demo.HelloController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WXController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    BaseApi baseApi;

    @RequestMapping("/wx")
    public String wx(){
        baseApi.messageHandle();
        return "";
    }



}
