package com.binbin.cloud.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: BinBin
 * @Date: 2024/01/09/17:43
 * @Description:
 */
@MapperScan(basePackages = "com.binbin")
@ComponentScan(basePackages = "com.binbin")
@SpringBootApplication(scanBasePackages = "com.binbin", exclude = DataSourceAutoConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
