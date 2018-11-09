package com.legend.springbootjpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringbootJpaLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaLearnApplication.class, args);
    }

}
