package com.binbin.cloud.order.controller;

import com.binbin.cloud.order.service.OrderService;
import io.seata.core.context.RootContext;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/17:27
 * @Description:
 */
@Tag(name = "订单模块")
@RequestMapping(value = "/api/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/debit")
    public void debit(@RequestParam String userId, @RequestParam String commodityCode, @RequestParam Integer count) {
        System.out.println("order XID " + RootContext.getXID());
        orderService.create(userId, commodityCode, count);
    }

}
