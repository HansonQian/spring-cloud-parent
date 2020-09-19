package com.github.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @className: OrderConfiguration
 * @description: 订单配置类
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-05 01:39
 **/
@Configuration
public class OrderConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
