package com.legend.springbootjpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringbootJpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaDemoApplication.class, args);
    }

}
