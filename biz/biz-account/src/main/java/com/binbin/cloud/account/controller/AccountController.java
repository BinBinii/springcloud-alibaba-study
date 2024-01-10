package com.binbin.cloud.account.controller;

import com.binbin.cloud.account.service.AccountService;
import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/11:36
 * @Description:
 */
@RestController
@RequestMapping(value = "/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public void debit(@RequestParam String userId, @RequestParam BigDecimal orderMoney) {
        System.out.println("account XID " + RootContext.getXID());
        accountService.debit(userId, orderMoney);
    }

    @PostMapping
    public void create(@RequestParam String userId, @RequestParam BigDecimal money) {
        System.out.println("account XID ");
        accountService.create(userId, money);
    }

}
