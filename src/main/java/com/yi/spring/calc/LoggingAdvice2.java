package com.yi.spring.calc;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice2 implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println( "[메서드 호출 전 : 22222" );
        System.out.println( invocation.getMethod() + "메서드 호출 전" );

        Object object = invocation.proceed();

        System.out.println( "[메서드 호출 후 : 22222" );
        System.out.println( invocation.getMethod() + "메서드 호출 후" );
        return object;
    }
}
