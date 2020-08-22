package com.zzb.springcloud.service;

import com.zzb.springcloud.dao.PaymentDao;
import com.zzb.springcloud.entities.PaymentBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    public int create(PaymentBean paymentBean)
    {
        return paymentDao.create(paymentBean);
    }

    public PaymentBean selectPaymentById(Long id)
    {
        return paymentDao.selectPaymentById(id);
    }
}
