package com.example.hanger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.hanger.dao")
public class HangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HangerApplication.class, args);
    }

}
