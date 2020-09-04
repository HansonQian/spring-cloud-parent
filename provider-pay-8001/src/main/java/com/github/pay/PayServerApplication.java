package com.github.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @className: PayServerApplication
 * @description: 支付服务
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 22:26
 **/
@SpringBootApplication
@EnableTransactionManagement
public class PayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayServerApplication.class, args);
    }
}
