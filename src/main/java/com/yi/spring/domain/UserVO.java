package com.yi.spring.domain;

import lombok.*;

@Getter
@Setter
@ToString
public class UserVO {
    @Getter
    private int userNo;
    private String userId;
    private String userName;
    private String password;
}
