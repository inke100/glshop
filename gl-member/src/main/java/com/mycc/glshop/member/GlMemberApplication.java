package com.mycc.glshop.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.mycc.glshop.member.feign")
@SpringBootApplication

public class GlMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlMemberApplication.class, args);
    }

}
