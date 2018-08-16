package com.afcat.springcloud;

import com.afcat.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created by yangxu on 2018/8/10.
 */
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name = "SPRINGCLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_APP.class,args);
    }
}
