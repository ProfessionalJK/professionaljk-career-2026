package com.professionaljk.orders.logging;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class RequestLoggingInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(RequestLoggingInterceptor.class);
    private static final DateTimeFormatter ISO = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String ts = ZonedDateTime.now().format(ISO);
        String method = request.getMethod();
        String path = request.getRequestURI();
        logger.info("{} Request → [{}] {}", ts, method, path);
        return true; // continue processing
    }
}