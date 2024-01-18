package com.yi.spring.p21.dao;

import com.yi.spring.p21.vo.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository( "MemberDAO" )
public class MemberDAOImpl implements MemberDAO{
    @Autowired
    private SqlSession session;
    @Override
    public List<MemberVO> listMembers() {
//        String sql = "select * from member order by userid";
        List<MemberVO> list = session.selectList( "memberMapper.listMembers");
        return list;
    }

    @Override
    public void addMember(MemberVO vo ) {

    }
}
