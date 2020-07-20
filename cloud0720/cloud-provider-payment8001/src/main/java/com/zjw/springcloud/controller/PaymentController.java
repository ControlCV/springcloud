package com.zjw.springcloud.controller;

import com.zjw.springcloud.entities.CommonResult;
import com.zjw.springcloud.entities.Payment;
import com.zjw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/insert")
    public CommonResult insert(Payment payment){
        int insert = paymentService.insert(payment);
        log.info("插入结果："+insert);
        if(insert>0){
            return  new CommonResult(200,"插入数据库成功",insert);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果："+paymentById);
        if(paymentById!=null){
            return  new CommonResult(200,"查询数据库成功",paymentById);
        }else{
            return new CommonResult(444,"查询数据库无对应记录，ID："+id,null);
        }
    }

}
