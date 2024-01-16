package com.yi.spring.person;

import org.aspectj.lang.JoinPoint;

public class PersonServiceImpl implements PersonService{
    private String name;
    private int age;

    public PersonServiceImpl(String name) {
        this.name = name;
    }

    public PersonServiceImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonServiceImpl() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void sayHello() {
        System.out.println( "이름: " + name );
        System.out.println( "나이: " + age + "살" );
    }

    public void beforemethod(JoinPoint joinPoint) throws Throwable {
        System.out.println( joinPoint );
    }

    public void beforeController(JoinPoint joinPoint) throws Throwable {
    }
}
