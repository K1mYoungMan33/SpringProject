package com.yi.spring.p21.service;

import com.yi.spring.p21.vo.MemberVO;

import java.util.List;

public interface MemberService {
    public List<MemberVO> listMembers();

    MemberVO selectMember(MemberVO vo);

    public void addMember(MemberVO vo );

    void updateMember(MemberVO vo);

    void deleteMember(MemberVO vo);
}
