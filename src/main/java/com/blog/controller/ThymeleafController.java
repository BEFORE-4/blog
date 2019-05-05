package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class ThymeleafController {

    @RequestMapping("/hi")
    public String hello(Locale locale, Model model){
        model.addAttribute("greeting", "Hello!");
        Date date = new Date();
        DateFormat format = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formatDate = format.format(date);
        System.out.println(formatDate);
        model.addAttribute("currentTime", formatDate);
        return "hello";
    }
    @RequestMapping("/index1")
    public String index(){
        return "index1";
    }
}
