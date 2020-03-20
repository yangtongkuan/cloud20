package com.study.cloud.controller;

import com.study.cloud.entities.Payment;
import com.study.cloud.remote.service.FeignPaymentService;
import com.study.cloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Resource
    private FeignPaymentService feignPaymentService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        return feignPaymentService.get(id);
    }

    @PostMapping("/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        return feignPaymentService.create(payment);
    }
}
