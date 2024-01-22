package com.yi.spring.mappers;

import com.yi.spring.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> listMembers();
    public MemberVO selectMember(@Param("vo") MemberVO vo);
    public void addMember(@Param("vo") MemberVO vo);
    public void updateMember(@Param("vo") MemberVO vo);
    public void deleteMember(@Param("vo") MemberVO vo);

}
