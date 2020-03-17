package com.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/3/17 22:50
 * @To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrderZkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderZkMain80.class, args);
    }
}
