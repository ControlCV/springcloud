package com.zjw.springcloud.service;

import com.zjw.springcloud.entities.Payment;

public interface PaymentService {
    int insert(Payment payment);
    Payment getPaymentById(Long id);
}
