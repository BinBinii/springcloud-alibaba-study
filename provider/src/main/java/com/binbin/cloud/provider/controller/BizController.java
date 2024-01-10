package com.binbin.cloud.provider.controller;

import com.binbin.cloud.provider.service.BizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/11:57
 * @Description:
 */
@RestController
@RefreshScope
@RequestMapping("/biz")
public class BizController {

    @Value("${username}")
    private String username;

    @Autowired
    private BizService bizService;

    @GetMapping("/get")
    public String get() {
        return username;
    }

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }

    @GetMapping(value = "/info")
    public Map<String, Object> getInfo(@RequestParam String username) {
        return bizService.getInfo(username);
    }

}
