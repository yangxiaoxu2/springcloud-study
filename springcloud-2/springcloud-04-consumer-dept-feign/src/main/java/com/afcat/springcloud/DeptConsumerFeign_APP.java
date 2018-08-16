package com.afcat.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by yangxu on 2018/8/10.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.afcat.springcloud"})
@ComponentScan("com.afcat.springcloud")
public class DeptConsumerFeign_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_APP.class,args);
    }
}
