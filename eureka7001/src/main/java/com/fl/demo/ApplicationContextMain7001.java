package com.fl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationContextMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContextMain7001.class,args);
    }

}
