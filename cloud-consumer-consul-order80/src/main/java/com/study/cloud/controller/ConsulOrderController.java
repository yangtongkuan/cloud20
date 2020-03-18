package com.study.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/3/17 22:52
 * @To change this template use File | Settings | File Templates.
 */
@RestController
public class ConsulOrderController {

    private static final String INVOKE_URL = "http://cloud-consul-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/consul")
    public String get() {
        String str = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return str;
    }
}
