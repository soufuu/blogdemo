package com.sofuu.blogdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sofuu.blogdemo.exception.NotFoundException;
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String indexPage(){

        return "home";
    }
}
