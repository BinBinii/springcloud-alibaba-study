package com.binbin.cloud.stock.controller;

import java.sql.SQLException;

import com.binbin.cloud.stock.domain.Stock;
import com.binbin.cloud.stock.service.StockService;
import io.seata.core.context.RootContext;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "库存模块")
@RequestMapping("/api/stock")
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @Operation(summary = "用户金额")
    @GetMapping(value = "/deduct")
    public void deduct(@RequestParam String commodityCode, @RequestParam Integer count) throws SQLException {
        System.out.println("stock XID " + RootContext.getXID());
        stockService.deduct(commodityCode, count);
    }

    @GetMapping(value = "/get/{id}")
    public Stock getById(@PathVariable("id") Integer id) {
        return stockService.get(id);
    }

    @GetMapping(value = "/batch/update")
    public void batchUpdateCond() {
        try {
            stockService.batchUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GetMapping(value = "/batch/delete")
    public void batchDeleteCond() {
        try {
            stockService.batchDelete();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}