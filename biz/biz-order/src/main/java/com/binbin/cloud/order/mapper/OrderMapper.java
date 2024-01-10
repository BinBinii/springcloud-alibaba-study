package com.binbin.cloud.order.mapper;

import com.binbin.cloud.order.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/17:10
 * @Description:
 */
@Mapper
public interface OrderMapper {

    int insert(Order record);

}
