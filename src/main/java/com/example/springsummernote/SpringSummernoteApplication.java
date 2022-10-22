package com.example.springsummernote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSummernoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSummernoteApplication.class, args);
    }
    @Bean(name = "uploadPath")
    public String uploadPath() {
        return "d:/image/";
    }
}
