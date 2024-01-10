package com.binbin.cloud.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/17:15
 * @Description:
 */
@FeignClient(value = "biz-account")
public interface AccountClient {

    @GetMapping("/api/account")
    void debit(@RequestParam String userId, @RequestParam BigDecimal orderMoney);
}
