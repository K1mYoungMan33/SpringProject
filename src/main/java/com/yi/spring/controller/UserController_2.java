package com.yi.spring.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

public class UserController_2 {
    public void setMethodNameResolver(String methodNameResolver) {
    }

//    @PostMapping("/login")
    public ModelAndView login(HttpServletRequest req, HttpServletResponse res ) throws Exception {

        System.out.println( req.getParameter("id" ));
        System.out.println( req.getParameter("name" ));

        ModelAndView mav = new ModelAndView();
        mav.addObject( "userId", req.getParameter( "id" ) );
        mav.addObject( "userName", req.getParameter( "name" ) );
        mav.setViewName( "member/login" );

        return mav;
    }

//    @GetMapping("/login")
    public String loginForm(HttpServletRequest req, HttpServletResponse res ) throws Exception {
        return "member/loginForm";
    }

    public String logoutGGGG(@PathVariable String id) throws Exception {
        System.out.println("아이디는 "+id);
        return "index";
    }

//    @GetMapping("/logout")
    public String logout( String id) throws Exception {
        System.out.println("아이디는 "+id);
        return "index";
    }

}
