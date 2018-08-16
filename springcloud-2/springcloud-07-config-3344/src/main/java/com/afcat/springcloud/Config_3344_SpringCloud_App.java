package com.afcat.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by yangxu on 2018/8/15.
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_SpringCloud_App {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_SpringCloud_App.class,args);
    }
}
