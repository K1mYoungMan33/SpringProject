package com.yi.spring.p21.service;

import com.yi.spring.p21.vo.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class MemberServiceImpl2 implements MemberService {
    @Autowired
//    private MemberDAO memberDAO;
    private SqlSession sqlSession;


//    public void setMemberDAO(MemberDAO memberDAO){
//        this.memberDAO = memberDAO;
//    }
    @Override
    public List<MemberVO> listMembers(){
        List<MemberVO> memberList = null;
//        memberList = memberDAO.listMembers();
        memberList = sqlSession.selectList( "mappers.MemberMapper.listMembers" );
        return memberList;
    }

    @Override
    public MemberVO selectMember(MemberVO vo) {
        return sqlSession.selectOne( "selectMember", vo );
    }
    @Override
    public void addMember(MemberVO vo ) {
        sqlSession.insert( "addMember", vo );
    }
    @Override
    public void updateMember(MemberVO vo) {
        sqlSession.update( "updateMember", vo );
    }
    @Override
    public void deleteMember(MemberVO vo ) {
        sqlSession.delete( "deleteMember", vo );
    }
}
