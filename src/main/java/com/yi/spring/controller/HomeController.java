package com.yi.spring.controller;

import com.yi.spring.person.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {

        InternalResourceViewResolver irvr = new InternalResourceViewResolver( "/WEB-INF/views", ".jsp" );

        ApplicationContext context = new ClassPathXmlApplicationContext( "person.xml" );
        PersonService personService = context.getBean( "personService", PersonService.class );
        personService.sayHello();
        ((ClassPathXmlApplicationContext)context).close();


        return "index";
    }
}
