package com.study.cloud.controller;

import com.study.cloud.entities.Payment;
import com.study.cloud.service.PaymentService;
import com.study.cloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果--->" + result);
        if (result > 0) {
            log.info("数据id->" + payment.getId());
            return new CommonResult(200, "插入数据库成功", result);
        } else {
            return new CommonResult(500, "插入数据库失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info(payment.toString());
        if (payment != null) {
            return new CommonResult(200, "成功", payment);
        } else {
            return new CommonResult(404, "没有对应的记录id:" + id, null);
        }
    }
}
