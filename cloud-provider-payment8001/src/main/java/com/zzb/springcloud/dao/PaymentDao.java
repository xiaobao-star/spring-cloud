package com.zzb.springcloud.dao;

import com.zzb.springcloud.entities.PaymentBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int create(PaymentBean paymentBean);

    public PaymentBean selectPaymentById(@Param("id") Long id);
}
