package com.study.cloud.controller;

import com.study.cloud.entities.Payment;
import com.study.cloud.service.PaymentService;
import com.study.cloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;


    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果--->" + result + "---->port:" + port);
        if (result > 0) {
            log.info("数据id->" + payment.getId());
            return new CommonResult(200, "插入数据库成功;port:" + port, result);
        } else {
            return new CommonResult(500, "插入数据库失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("server.port \t" + port);
        if (payment != null) {
            return new CommonResult(200, "成功;port:" + port, payment);
        } else {
            return new CommonResult(404, "没有对应的记录id:" + id, null);
        }
    }
}
