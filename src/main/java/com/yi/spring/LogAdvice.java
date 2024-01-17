package com.yi.spring;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {

    public void printLog(JoinPoint joinPoint) throws Throwable {
        System.out.println( "공통 비니지스 로직");
    }

    public void printLogging(JoinPoint joinPoint) throws Throwable {
        System.out.println( "[공통로그 - LogAdvice] 비니지스 로직 수행 후 동작" + joinPoint.toString() );
    }
}
