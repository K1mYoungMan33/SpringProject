package com.yi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {

        InternalResourceViewResolver irvr = new InternalResourceViewResolver( "/WEB-INF/views", ".jsp" );


        return "index";
    }
}
