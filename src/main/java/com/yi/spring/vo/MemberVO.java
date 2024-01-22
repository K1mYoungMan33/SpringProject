package com.yi.spring.vo;

import lombok.*;

@Getter
@Setter
@ToString
public class MemberVO {
    private int userNo;
    private String userId;
    private String userName;
    private String userPassword;

    @Getter
    @Setter
    @ToString
    @RequiredArgsConstructor
    public static class DepartmentIn {
        private int deptNo;
        private String deptName;
    }

    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    public static class EmployeeIn {
        private String empCode;
        private String empName;
        private String empTitle;
        private String empAuth;
        private int empSalary;
        private String empTel;
        private String empId;
        private String empPwd;
        private Department dept;
        private String pic;
        private boolean empRetire;
    }

    public static class EmployeeVO {
    }
}
