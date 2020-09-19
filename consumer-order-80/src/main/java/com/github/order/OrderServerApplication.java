package com.github.order;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @className: OrderServerApplication
 * @description: 订单服务
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-05 01:34
 **/
@EnableSwagger2Doc
@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
public class OrderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServerApplication.class,args);
    }
}
