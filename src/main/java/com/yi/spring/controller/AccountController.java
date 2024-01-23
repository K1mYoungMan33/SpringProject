package com.yi.spring.controller;

import com.yi.spring.exception.ErrorCode;
import com.yi.spring.exception.ErrorResponse;
import com.yi.spring.exception.InsufficientBalanceException;
import com.yi.spring.service.AccountService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
    public String sendMoney(Model model){

        try {
            accountService.sendMoney();
        } catch (InsufficientBalanceException e) {
            model.addAttribute( "msg", e.getInsufficientBalanceMsg() );
            e.printStackTrace();
        }
        model.addAttribute( "aaa", 1000 );

        return "/account/list";
    }

    @ExceptionHandler(value= InsufficientBalanceException.class)
    public ResponseEntity<ErrorResponse> handleInsufficientBalanceException(InsufficientBalanceException e ) {
        String str = ( "잔액이 부족합니다.");
        ErrorResponse errorResponse = ErrorResponse.of(ErrorCode.NOT_VALID_ERROR, str );
//            @Override
//            public HttpStatusCode getStatusCode() {
//                return null;
//            }
//
//            @Override
//            public ProblemDetail getBody() {
//                return null;
//            }
//        };
//        errorResponse.setCode( "001" );
//        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}
