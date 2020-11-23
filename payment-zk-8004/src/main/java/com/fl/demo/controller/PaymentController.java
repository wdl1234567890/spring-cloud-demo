package com.fl.demo.controller;

import com.fl.demo.pojo.CommonResult;
import com.fl.demo.pojo.Payment;
import com.fl.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    String port;

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") int id){
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult(200, "success:" + port, payment);
    }
}
