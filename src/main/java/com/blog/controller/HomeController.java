package com.blog.controller;

import com.blog.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    Book book;

    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String home(){
        return "test";
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String home1(){
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "book", method = RequestMethod.GET)
    public String getBook(){
        return "hello," + book.getName() + ", writer is " +
                book.getWriter() + " your age is " + book.getAge() ;
    }
}
