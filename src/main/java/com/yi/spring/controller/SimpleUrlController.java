package com.yi.spring.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SimpleUrlController /*implements Controller*/ {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println( "aaaaaaaaaaaaaaaaaaaa");
        return new ModelAndView( "index.jsp" );
    }
}
