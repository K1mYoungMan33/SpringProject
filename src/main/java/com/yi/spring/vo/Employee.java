package com.yi.spring.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee {
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