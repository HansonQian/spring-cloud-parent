package com.github.eureka.cluster.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @className: EurekaClusterServerApplication
 * @description: Eureka集群服务器1
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-05 20:44
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaClusterServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterServerApplication.class,args);
    }
}
