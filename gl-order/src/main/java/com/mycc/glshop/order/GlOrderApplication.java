package com.mycc.glshop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GlOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlOrderApplication.class, args);
    }

}
