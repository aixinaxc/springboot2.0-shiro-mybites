package com.example.demo.weixin;

import com.alibaba.fastjson.JSON;
import com.example.demo.HelloController;
import com.example.demo.utils.Empty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class BaseApi {
    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private Environment env;

    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * 获得微信公众号AccessToken
     * @return AccessToken
     */
    public String getAccessToken(){
        String accessToken = (String) redisTemplate.opsForValue().get("vx_access_token");
        if(Empty.isEmpty(accessToken)){
            SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
            requestFactory.setConnectTimeout(1000);
            requestFactory.setReadTimeout(1000);
            RestTemplate restTemplate = new RestTemplate(requestFactory);
            String appId = env.getProperty("vxAppId");
            String appSecret = env.getProperty("vxAppSecret");
            if(Empty.isEmpty(appId) || Empty.isEmpty(appSecret)){
                return "";
            }
            String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appId+"&secret="+appSecret;
            Map map=restTemplate.getForObject(url,Map.class);
            logger.warn("getAccessToken:" + JSON.toJSONString(map));
            if(map.get("access_token") == null || map.get("access_token") == "" || map.get("expires_in") == null ||
            map.get("expires_in") == ""){
                return "";
            }
            redisTemplate.opsForValue().set("vx_access_token",map.get("access_token"),
                    Long.parseLong(map.get("expires_in").toString())-10,TimeUnit.SECONDS);
            return map.get("access_token").toString();
        }else {
            return accessToken;
        }
    }


    public void messageHandle(){

    }


}
