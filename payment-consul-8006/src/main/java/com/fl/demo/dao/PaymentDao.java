package com.fl.demo.dao;

import com.fl.demo.pojo.Payment;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PaymentDao {

    public static Map<Integer, Payment> paymentMap = new HashMap<Integer, Payment>();
    static {
        paymentMap.put(1,new Payment(1, "aa"));
        paymentMap.put(2,new Payment(2, "bb"));
        paymentMap.put(3,new Payment(3, "cc"));
    }
    public Payment getPaymentById(int id){
        return paymentMap.get(id);
    }
}
