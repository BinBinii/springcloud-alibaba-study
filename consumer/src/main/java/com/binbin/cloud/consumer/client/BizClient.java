package com.binbin.cloud.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/14:04
 * @Description:
 */
@Component
@FeignClient(value = "provider")
public interface BizClient {

    @GetMapping(value = "/biz/info")
    Map<String, Object> getInfo(@RequestParam String username);

}
