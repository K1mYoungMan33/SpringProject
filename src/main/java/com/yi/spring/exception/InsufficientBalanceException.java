package com.yi.spring.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
public class InsufficientBalanceException extends Exception {
//    private String accountNo;
//    private String insufficientBalance;
    private String insufficientBalanceMsg;

}
