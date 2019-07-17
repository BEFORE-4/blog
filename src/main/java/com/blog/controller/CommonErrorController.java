package com.blog.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 增加错误提示页面
 */
@RestController
public class CommonErrorController implements ErrorController {

    private final String ERROR_PATH = "/error";
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    //当找不到页面跳转到/error的时候，返回字符串
    @RequestMapping(value = ERROR_PATH)
    public String handleError(){
        System.out.println(getErrorPath());
        return "error";
    }
}
