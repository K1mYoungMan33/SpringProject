package com.yi.spring.member;

public class MemberServiceImpl implements MemberService {
    private MemberDAO memberDAO;
    private String name;
    private int age;

    public MemberServiceImpl(String name) {
        this.name = name;
    }

    public MemberServiceImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MemberDAO getMemberDAO() {
        return memberDAO;
    }

    public void setMemberDAO(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public MemberServiceImpl() {

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
    public void listMembers() {
        memberDAO.listMembers();
    }
}
