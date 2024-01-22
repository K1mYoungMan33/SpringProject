package com.yi.spring.service;

import com.yi.spring.mappers.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void sendMoney() throws Exception {
        accountMapper.updateBalance1();
        if ( true )
            throw new Exception();
        accountMapper.updateBalance2();

    }
}
