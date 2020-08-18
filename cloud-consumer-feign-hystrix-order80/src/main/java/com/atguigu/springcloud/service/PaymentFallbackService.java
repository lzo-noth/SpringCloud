package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK()方法对应的降级方法";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) throws InterruptedException {
        return "paymentInfo_TimeOut()方法对应的降级方法";
    }
}
