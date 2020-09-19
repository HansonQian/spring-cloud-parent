package com.github.pay;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @className: PayClusterServerApplication
 * @description: 支付服务
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 22:26
 **/
@EnableSwagger2Doc
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@EntityScan("com.github.entities")
public class PayClusterServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayClusterServerApplication.class, args);
    }
}
