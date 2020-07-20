package com.zjw.springcloud.service.impl;

import com.zjw.springcloud.dao.PaymentDao;
import com.zjw.springcloud.entities.Payment;
import com.zjw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl  implements PaymentService {
    @Autowired
    private PaymentDao paymentdao;


    @Override
    public int insert(Payment payment) {
        return paymentdao.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentdao.getPaymentById(id);
    }
}
