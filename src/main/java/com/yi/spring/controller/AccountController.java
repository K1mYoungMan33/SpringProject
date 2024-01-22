package com.yi.spring.controller;

import com.yi.spring.service.AccountService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Setter
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
//    @Transactional
//    public void setAccountService(AccountService accountService){
//        this.accountService = accountService;
//    }

//    @RequestMapping(value ="/accountt/balance", method= RequestMethod.GET)
    @GetMapping("/accountt/balance")
    @Transactional
    public String sendMoney(Model model) throws Exception{
        accountService.sendMoney();
        model.addAttribute( "aaa", 1000 );

        return "/account/list";
    }
}
