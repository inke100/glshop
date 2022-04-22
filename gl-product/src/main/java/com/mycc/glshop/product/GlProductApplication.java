package com.mycc.glshop.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GlProductApplication {

    public static void main(String[]  args) {
        SpringApplication.run(GlProductApplication.class, args);
    }

}
