package com.fl.demo.controller;

import com.fl.demo.pojo.CommonResult;
import com.fl.demo.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

    public static final String url = "http://cloud-zookeepr-payment";

    @GetMapping("/order/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") int index) {

        return restTemplate.getForObject(url + "/payment/" + index, CommonResult.class, (Object) null);
    }

    @GetMapping("/infos")
    public void getDiscoveryInfos(){
        List<String> services = discoveryClient.getServices();
        System.out.println(services);

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT");
        for (ServiceInstance serviceInstance:instances){
            System.out.println(serviceInstance.getUri());
        }

    }
}
