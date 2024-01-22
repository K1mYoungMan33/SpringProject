package com.yi.spring.p21.service;

import com.yi.spring.p21.vo.MemberVO;
import com.yi.spring.p22.mappers.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
//    private MemberDAO memberDAO;
    private MemberMapper memberMapper;

//    @Autowired
//    private SqlSession sqlSession;

//    public void setMemberDAO(MemberDAO memberDAO){
//        this.memberDAO = memberDAO;
//    }
    @Override
    public List<MemberVO> listMembers(){
        List<MemberVO> memberList = null;
//        memberList = memberDAO.listMembers();
//        memberList = sqlSession.selectList( "mappers.MemberMapper.listMembers" );
        memberList = memberMapper.listMembers();
        return memberList;
    }

    @Override
    public MemberVO selectMember(MemberVO vo) {
//        return sqlSession.selectOne( "selectMember", vo );
        return memberMapper.selectMember( vo );
    }
    @Override
    public void addMember(MemberVO vo ) {
//        sqlSession.insert( "addMember", vo );
        memberMapper.addMember( vo );
    }
    @Override
    public void updateMember(MemberVO vo) {
//        sqlSession.update( "updateMember", vo );
        memberMapper.updateMember( vo );
    }
    @Override
    public void deleteMember(MemberVO vo ) {
//        sqlSession.delete( "deleteMember", vo );
        memberMapper.deleteMember( vo );
    }
}
