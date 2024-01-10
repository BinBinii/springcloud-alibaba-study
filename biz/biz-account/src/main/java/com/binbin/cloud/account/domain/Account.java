package com.binbin.cloud.account.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/11:11
 * @Description:
 */
@Data
public class Account {

    private Integer id;

    private String userId;

    private BigDecimal money;

}
