package com.yi.spring.p21.dao;

import com.yi.spring.p21.vo.MemberVO;

import java.util.List;

public interface MemberDAO {
    List<MemberVO> listMembers();
    public void addMember(MemberVO vo );
}
