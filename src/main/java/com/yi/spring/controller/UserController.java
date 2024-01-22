package com.yi.spring.controller;

import com.yi.spring.domain.UserVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user/*")
public class UserController {
    public void setMethodNameResolver(String methodNameResolver) {
    }

    @PostMapping("/login")
    public String login(UserVO vo, Model model) throws Exception {

        System.out.println( vo.getUserId() );
        System.out.println( vo.getUserNo() );
        System.out.println( vo.getUserName() );
        System.out.println( vo.getPassword() );

//        model.addAllAttributes( )
        model.addAttribute( "userNo", vo.getUserNo() );
        model.addAttribute( "userId", vo.getUserId() );
        model.addAttribute( "userName", vo.getUserName() );
        model.addAttribute( "password", vo.getPassword() );

        return "member/login";
    }

    @GetMapping("/login")
    public String loginForm(HttpServletRequest req, HttpServletResponse res ) throws Exception {
        return "member/loginForm";
    }

    @GetMapping("/test22")
    public String test(String id) throws Exception {
        System.out.println("test page : "+id);
        return "redirect:/login";
    }


    @GetMapping("/logout")
    public String logout( String id) throws Exception {
        System.out.println("아이디는 "+id);
        return "index";
    }

}
