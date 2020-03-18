package com.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/3/17 22:19
 * @To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@EnableDiscoveryClient // 注册中心为zookeeper 和consou时使用注解标识微服务
public class PaymentZkMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZkMain8004.class, args);
    }
}
