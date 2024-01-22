package com.yi.spring.service;

import com.yi.spring.exception.InsufficientBalanceException;

public interface AccountService {
    void sendMoney() throws InsufficientBalanceException;
    int getBalance( String accountNumber ) throws Exception;
}
