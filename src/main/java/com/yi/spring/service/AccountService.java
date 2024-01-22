package com.yi.spring.service;

public interface AccountService {
    void sendMoney() throws Exception;
    int getBalance( String accountNumber ) throws Exception;
}
