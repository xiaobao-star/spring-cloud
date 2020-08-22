package com.zzb.springcloud.controller;

import com.zzb.springcloud.entities.CommentResult;
import com.zzb.springcloud.entities.PaymentBean;
import com.zzb.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    public CommentResult commentResult;


    @PostMapping("/payment/create")
    public CommentResult create(PaymentBean paymentBean)
    {
        int result = paymentService.create(paymentBean);

        log.info("*****************************");
        log.info("*****************************");
        return result > 0 ? new CommentResult(200,"插入成功",result): new CommentResult(444,"插入失败", result);
    }
    @GetMapping("/payment/get/{id}")
    public CommentResult selectById(@PathVariable("id") Long id){

        PaymentBean paymentBean = paymentService.selectPaymentById(id);
        return new CommentResult(200,"成功",paymentBean);
    }

}
