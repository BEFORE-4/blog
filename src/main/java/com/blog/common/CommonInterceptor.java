package com.blog.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 *
 */
@Component
public class CommonInterceptor implements HandlerInterceptor {
    Logger logger = LoggerFactory.getLogger(CommonInterceptor.class);

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        logger.info("请求ip:" + request.getRemoteAddr());
        logger.info("请求的方法: " + request.getMethod());
    }
}
