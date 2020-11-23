package com.fl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationContextMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContextMain7002.class);
    }

}
