package com.guonl.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Author: guonl
 * Description: TODO
 * Date: 2018/2/6 17:13
 */
@SpringBootApplication(scanBasePackages = {"com.guonl.security"})
@MapperScan("com.guonl.security.mapper")
public class ApplicationRunner {
    
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class , args);
    }

}
