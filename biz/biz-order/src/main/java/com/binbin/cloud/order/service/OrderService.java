package com.binbin.cloud.order.service;

import com.binbin.cloud.order.client.AccountClient;
import com.binbin.cloud.order.domain.Order;
import com.binbin.cloud.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/17:14
 * @Description:
 */
@Service
public class OrderService {

    @Autowired
    private AccountClient accountClient;
    @Autowired
    private OrderMapper orderMapper;

    public void create(String userId, String commodityCode, Integer count) {
        BigDecimal orderMoney = new BigDecimal(count).multiply(new BigDecimal(5));
        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setCount(count);
        order.setMoney(orderMoney);

        orderMapper.insert(order);

        accountClient.debit(userId, orderMoney);

    }
}
