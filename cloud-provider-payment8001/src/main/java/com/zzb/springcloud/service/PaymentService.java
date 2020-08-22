package com.zzb.springcloud.service;

import com.zzb.springcloud.entities.PaymentBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface PaymentService {

    public int create(PaymentBean paymentBean);

    public PaymentBean selectPaymentById(@Param("id") Long id);
}
