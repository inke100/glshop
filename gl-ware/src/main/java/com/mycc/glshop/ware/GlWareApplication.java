package com.mycc.glshop.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GlWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlWareApplication.class, args);
    }

}
