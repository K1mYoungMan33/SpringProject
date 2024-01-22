package com.yi.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/test")
    public String test(Locale locale){
        logger.info("환영합니다. client Locate->{}", locale );

        return "test";
    }
}
