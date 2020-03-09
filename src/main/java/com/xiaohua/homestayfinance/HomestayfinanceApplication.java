package com.xiaohua.homestayfinance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xiaohua.homestayfinance.mapper") //扫描的mapper
@SpringBootApplication
public class HomestayfinanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomestayfinanceApplication.class, args);
    }

}
