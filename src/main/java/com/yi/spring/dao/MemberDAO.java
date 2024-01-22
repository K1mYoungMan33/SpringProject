package com.yi.spring.dao;

import com.yi.spring.vo.MemberVO;

import java.util.List;

public interface MemberDAO {
    List<MemberVO> listMembers();
    public void addMember(MemberVO vo );
}
