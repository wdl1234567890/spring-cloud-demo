package com.fl.demo.service.Impl;

import com.fl.demo.dao.PaymentDao;
import com.fl.demo.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import com.fl.demo.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(int id) {
        return paymentDao.getPaymentById(id);
    }
}
