package com.yi.spring.controller;

import com.yi.spring.calc.Calculator;
import com.yi.spring.member.MemberService;
import com.yi.spring.person.PersonService;
import com.yi.spring.person.PersonServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class CalcController {
    @GetMapping("/calc")
    public String index() {

        ApplicationContext context = new ClassPathXmlApplicationContext( "AOPTest.xml" );

        Calculator cal = (Calculator) context.getBean( "proxyCal" );
        cal.add( 100, 20 );
        System.out.println();
        cal.subtract( 100, 20 );
        System.out.println();
        cal.multiply( 100, 20 );
        System.out.println();
        cal.divide( 100, 20 );
        System.out.println();




        return "index";
    }
}
