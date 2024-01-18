package com.yi.spring.p21.controller;

import com.yi.spring.p21.service.MemberService;
import com.yi.spring.p21.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@ComponentScan
@RequestMapping("/p21/member/*")
public class MemberController {
    @Autowired
    private MemberService memberService;
    private static final String namespace = "mappers.MemberMapper.";
    @GetMapping("/userAdd")
    public void aaaaa()
    {

    }

    @GetMapping("addMember")
    public String addMemberForm(MemberVO vo, Model model) throws Exception {
        return "member/listForm";
    }

    @PostMapping("addMember")
    public String addMember(MemberVO vo, Model model) throws Exception {
        System.out.println( vo.getUserId() );
        System.out.println( vo.getUserName() );
        System.out.println( vo.getUserPassword() );

        memberService.addMember( vo );
//        return "member/list";
        return "redirect:listMember";
    }

    @GetMapping("listMember")
    public String listMember(MemberVO vo, Model model) throws Exception {
        List<MemberVO> list = memberService.listMembers();
        model.addAttribute("listMembers", list);
        return "member/list";
    }
    @GetMapping("updateMember")
    public String updateMemberForm(MemberVO vo, Model model) throws Exception
    {
        System.out.println( vo );
//        List<MemberVO> member = memberService.selectMember(vo);
//        if ( member != null && member.size() > 0 )
//            model.addAttribute( "member", member.get(0) );
        MemberVO member = memberService.selectMember(vo);
            model.addAttribute( "member", member );

        return "member/memberUpdate";
    }
    @PostMapping("updateMember")
    public String updateMember(MemberVO vo, Model model) throws Exception {
        System.out.println( vo );
        memberService.updateMember(vo);
        return "member/list";
    }
    @GetMapping("deleteMember")
    public String deleteMember(MemberVO vo, Model model) throws Exception {
        memberService.deleteMember(vo);
        return "member/list";
    }
}
