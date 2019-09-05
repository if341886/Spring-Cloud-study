package com.geteway.springcloudgeteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient //把服务注册到eureka   @EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class SpringcloudGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGetewayApplication.class, args);
    }

}
