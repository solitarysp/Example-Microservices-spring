package com.lethanh98.ImageService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ImageServiceAPP {
    public static void main(String[] args) {
        SpringApplication.run(ImageServiceAPP.class, args);
    }
}
