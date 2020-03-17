package com.study.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 配置一个restTemplate
     * @return
     */
    @Bean
    @LoadBalanced // 开启负载均衡模式 默认为轮询模式
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
