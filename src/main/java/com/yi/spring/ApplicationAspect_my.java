package com.yi.spring;

import com.yi.spring.slf4j.Logger;
import com.yi.spring.slf4j.LoggerFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.ui.Model;

import java.util.Hashtable;
import java.util.Locale;

@Aspect
public class ApplicationAspect_my {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationAspect_my.class);
    private Hashtable<String, Long > sessionsList; // 세션 목록

    public ApplicationAspect_my(){
        sessionsList = new Hashtable<String, Long>(); // session list 객체 생성
    }

    @Around(value="execution(* com.yi.*.*(..)) && args(locale, model)")
    public Object beforeController(ProceedingJoinPoint pjp, Locale locale, Model model) throws Throwable{
        String key = "키1234554455"; //request.getRemoteAddr();

        if (sessionsList.get(key) == null || System.currentTimeMillis() - sessionsList.get(key) > 5000) {
            logger.debug("세션키가 발급되었습니다. IP : " + key);
            sessionsList.put(key, System.currentTimeMillis());
        } else {
            logger.debug(key + " 가 로그인하였습니다.");
        }

        return pjp.proceed(new Object[] {locale, model});
    }
}