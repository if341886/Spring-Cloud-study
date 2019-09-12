package com.message.springcloudmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 消息中心
 * @author bo.cheng
 *  //禁用Spring 自动配置单数据源
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class SpringcloudMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMessageApplication.class, args);
    }

}
