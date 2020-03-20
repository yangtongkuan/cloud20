package com.study.cloud.remote.service;

import com.study.cloud.entities.Payment;
import com.study.cloud.utils.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface FeignPaymentService {

    @GetMapping("/payment/get/{id}")
    CommonResult get(@PathVariable("id") Long id);

    @PostMapping("/payment/create")
    CommonResult create(@RequestBody Payment payment);
}
