package com.yi.spring.service;

import com.yi.spring.vo.MemberVO;

import java.util.List;

public interface MemberService {
    public List<MemberVO> listMembers();

    MemberVO selectMember(MemberVO vo);

    public void addMember(MemberVO vo );

    void updateMember(MemberVO vo);

    void deleteMember(MemberVO vo);
}
