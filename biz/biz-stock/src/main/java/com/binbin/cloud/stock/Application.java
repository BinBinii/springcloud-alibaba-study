package com.binbin.cloud.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/17:31
 * @Description:
 */
@MapperScan(basePackages = "com.binbin")
@SpringBootApplication(scanBasePackages = "com.binbin", exclude = DataSourceAutoConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}