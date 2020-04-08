package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 表示支持服务发现
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulProducerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsulProducerApplication.class,args);
    }

}
