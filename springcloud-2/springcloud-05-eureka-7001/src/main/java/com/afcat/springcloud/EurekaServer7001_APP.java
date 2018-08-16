package com.afcat.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by yangxu on 2018/8/10.
 */
@SpringBootApplication
@EnableEurekaServer //EurekaServer服务端启动类，接受其它微服务注册进来
public class EurekaServer7001_APP {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_APP.class,args);
    }

}
