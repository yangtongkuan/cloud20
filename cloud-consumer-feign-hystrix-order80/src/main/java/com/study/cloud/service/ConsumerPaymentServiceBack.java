package com.study.cloud.service;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2020/3/27 22:29
 * @To change this template use File | Settings | File Templates.
 */
@Service
public class ConsumerPaymentServiceBack implements ConsumerPaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务降级~~~~";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "服务降级~~~~";
    }
}
