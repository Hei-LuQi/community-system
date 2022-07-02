package com.example.communitysystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.example.communitySystem.mapper")
@ServletComponentScan(basePackages = {"com.example.communitysystem.filter"})
public class CommunitySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunitySystemApplication.class, args);
    }

}
