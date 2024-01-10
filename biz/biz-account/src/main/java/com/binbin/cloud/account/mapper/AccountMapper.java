package com.binbin.cloud.account.mapper;

import com.binbin.cloud.account.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/11:13
 * @Description:
 */
@Mapper
public interface AccountMapper {

    Account selectByUserId(@Param("userId") String userId);

    int updateById(Account record);

    void create(@Param("userId") String userId, @Param("money") BigDecimal money);

}
