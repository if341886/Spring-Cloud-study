package com.message.springcloudmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMessageApplication.class, args);
    }

}
