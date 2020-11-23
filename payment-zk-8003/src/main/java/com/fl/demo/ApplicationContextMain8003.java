package com.fl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationContextMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContextMain8003.class,args);
    }
}
