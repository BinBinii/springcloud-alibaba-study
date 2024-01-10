package com.binbin.cloud.gateway.filter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;

import java.util.List;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/14:27
 * @Description:
 */
@Slf4j
//@Component
public class LogGatewayFilterFactory extends AbstractGatewayFilterFactory<LogGatewayFilterFactory.Config> {


    public LogGatewayFilterFactory() {
        super(LogGatewayFilterFactory.Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return List.of("open");
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            if (config.open) {
                // 过滤器逻辑处理
                log.info("====开启日志====");
            }

            return chain.filter(exchange);
        };
    }

    @Data
    static class Config {
        private boolean open;
    }
}