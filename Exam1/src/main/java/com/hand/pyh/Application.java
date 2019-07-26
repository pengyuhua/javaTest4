package com.hand.pyh;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.hand.pyh.dao")
public class Application {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
