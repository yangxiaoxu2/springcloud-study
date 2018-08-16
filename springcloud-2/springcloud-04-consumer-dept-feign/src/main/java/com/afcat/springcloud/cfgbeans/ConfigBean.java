package com.afcat.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yangxu on 2018/8/10.
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //springcloud ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //return new RoundRobinRule();
        return new RandomRule(); //达到目的，用我们重新选择的随机算法替代默认的轮询
        //return new RandomRule_ZY();// 我自定义为每台机器5次
    }

}
