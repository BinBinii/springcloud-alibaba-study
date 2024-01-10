package com.binbin.cloud.provider.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Author: BinBin
 * @Date: 2024/01/10/11:56
 * @Description:
 */
@Component
@Slf4j
public class RequestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        String uri = request.getRequestURI();

        //获取请求参数
        String queryString = request.getQueryString();

        //获取请求body
        byte[] bodyBytes = StreamUtils.copyToByteArray(request.getInputStream());
        String body = new String(bodyBytes, request.getCharacterEncoding());

        log.info("uri -> {} 请求参数:{} 请求体：{}", uri, queryString, body);
        return true;
    }
}
