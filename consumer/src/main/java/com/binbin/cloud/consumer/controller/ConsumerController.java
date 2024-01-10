package com.binbin.cloud.consumer.controller;

import com.binbin.cloud.consumer.client.BizClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/14:06
 * @Description:
 */
@Slf4j
@RestController
public class ConsumerController {

    @Value("${spring.application.name}")
    private String appName;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private BizClient bizClient;

    @GetMapping("/username")
    public Map<String, Object> getUserInfo(@RequestParam String username) {
        return bizClient.getInfo(username);
    }

}
