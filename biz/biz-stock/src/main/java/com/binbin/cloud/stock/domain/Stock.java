package com.binbin.cloud.stock.domain;

import lombok.Data;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/17:33
 * @Description:
 */
@Data
public class Stock {

    private Integer id;

    private String commodityCode;

    private Integer count;

}
