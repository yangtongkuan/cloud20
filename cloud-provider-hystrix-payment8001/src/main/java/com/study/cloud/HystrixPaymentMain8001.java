package com.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // 开启服务降级
public class HystrixPaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixPaymentMain8001.class, args);
    }

}
