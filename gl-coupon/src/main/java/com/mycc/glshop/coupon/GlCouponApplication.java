package com.mycc.glshop.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery .EnableDiscoveryClient;

@EnableDiscoveryClient

@SpringBootApplication
public class GlCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlCouponApplication.class, args);
    }

}
