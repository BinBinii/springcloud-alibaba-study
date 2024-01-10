package com.binbin.cloud.order.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/17:10
 * @Description:
 */
@Data
public class Order {

    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private BigDecimal money;

}
