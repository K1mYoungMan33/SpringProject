package com.yi.spring.controller;

import com.yi.spring.LogAdvice;
import com.yi.spring.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HomeController22 {
    @GetMapping("/222")
    public String index() {

        InternalResourceViewResolver irvr = new InternalResourceViewResolver( "/WEB-INF/views", ".jsp" );

        ApplicationContext context = new ClassPathXmlApplicationContext( "person.xml" );


        LogAdvice log = (LogAdvice)context.getBean( "log" );


        ApplicationContext contextM = new ClassPathXmlApplicationContext( "member.xml" );
//        PersonService personService = context.getBean( "personService", PersonService.class );
//        personService.sayHello();
//
//
//        PersonService personService2 = (PersonService)context.getBean( "proxyCal" );
//        personService2.sayHello();
//
//        PersonService personService_ = new PersonServiceImpl( "야야호", 41 );
//        personService_.sayHello();
//
        MemberService memberService = contextM.getBean( "memberService", MemberService.class );
//
////        MemberDAO mdao = new MemberDAOImpl();
////        ((MemberServiceImpl)memberService).setMemberDAO( mdao );
        memberService.listMembers();
//

        ((ClassPathXmlApplicationContext)context).close();
        return "index";
    }
}
