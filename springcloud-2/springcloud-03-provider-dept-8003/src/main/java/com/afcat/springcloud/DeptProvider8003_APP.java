package com.afcat.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by yangxu on 2018/8/10.
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class DeptProvider8003_APP {

    public static void main(String[] args) {

        SpringApplication.run(DeptProvider8003_APP.class,args);

    }
}
