package com.yi.spring.controller;

import com.yi.spring.ApplicationAspect;
import com.yi.spring.LogAdvice;
import com.yi.spring.member.MemberDAO;
import com.yi.spring.member.MemberDAOImpl;
import com.yi.spring.member.MemberService;
import com.yi.spring.member.MemberServiceImpl;
import com.yi.spring.person.PersonService;
import com.yi.spring.person.PersonServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Locale;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationAspect.class);
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/test")
    public String test(Locale locale){
//    public String test(){
        logger.info("환영합니다. client Locate->{}", locale );

        return "test";
    }
}
