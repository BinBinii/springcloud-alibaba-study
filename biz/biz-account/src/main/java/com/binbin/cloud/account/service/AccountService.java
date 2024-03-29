package com.binbin.cloud.account.service;

import com.binbin.cloud.account.domain.Account;
import com.binbin.cloud.account.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/11:19
 * @Description:
 */
@Service
public class AccountService {

    private static final String ERROR_USER_ID = "1002";

    @Autowired
    private AccountMapper accountMapper;

    public void debit(String userId, BigDecimal num) {
        Account account = accountMapper.selectByUserId(userId);
        account.setMoney(account.getMoney().subtract(num));
        accountMapper.updateById(account);

        if (ERROR_USER_ID.equals(userId)) {
            throw new RuntimeException("account branch exception");
        }
    }

    public void create(String userId, BigDecimal money) {

        accountMapper.create(userId, money);
    }

}
