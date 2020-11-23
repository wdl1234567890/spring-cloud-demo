package com.fl.demo.service;

import com.fl.demo.pojo.Payment;
import org.springframework.stereotype.Service;

public interface PaymentService {
    public Payment getPaymentById(int id);
}
