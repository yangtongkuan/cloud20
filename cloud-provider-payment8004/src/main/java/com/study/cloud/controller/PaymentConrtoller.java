package com.study.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/3/17 22:20
 * @To change this template use File | Settings | File Templates.
 */
@RestController
@Slf4j
public class PaymentConrtoller {

    @Value("${server.port}")
    private String port;

    @GetMapping("payment/zk")
    public String get() {
        String str = "spring cloud for zookeeper port-->" + port+";" + Math.random();
        log.info(str);
        return str;
    }

}
