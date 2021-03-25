package com.ezen.mavenMember;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ezen.mavenMember.model.MemberDTO;
import com.ezen.mavenMember.service.MemberMapper;

@Controller
public class MemberController {
	
	@Autowired
	private MemberMapper memberMapper;

	@RequestMapping("/member.do")
	public String memberIndex(){
		return "main";
	}
	
	@RequestMapping("/memberSsn.do")
	public String memberSsn(){
		return "memberSsn";
	}
	
	@RequestMapping("/checkMember.do")
	public String checkMember(HttpServletRequest req){
		String name = req.getParameter("name");
		String ssn1 = req.getParameter("ssn1");
		String ssn2 = req.getParameter("ssn2");
		boolean isMember = 
				memberMapper.checkMember(name, ssn1, ssn2);
		String msg = null, url = null;
		if (isMember){
			msg = "���� ȸ���̽ʴϴ�. �α����� �� �ּ���";
			url = "member.do";
			req.setAttribute("msg", msg);
			req.setAttribute("url",  url);
			return "message";
		}else {
			req.setAttribute("name", name);
			req.setAttribute("ssn1", ssn1);
			req.setAttribute("ssn2", ssn2);
			return "member_input";
		}
	}
	
	@RequestMapping("/member_input_ok.do")
	public String memberInput(HttpServletRequest req, MemberDTO dto){
		int res = memberMapper.insertMember(dto);
		String msg = null, url = null;
		if (res>0){
			msg = "ȸ�����Լ���!! ȸ������������� �̵��մϴ�.";
			url = "memberAll.do";
		}else {
			msg = "ȸ�����Խ���!! ȸ�������������� �̵��մϴ�.";
			url = "member.do";
		}
		req.setAttribute("msg", msg);
		req.setAttribute("url",  url);
		return "message";
	}
	
	@RequestMapping("/memberAll.do")
	public ModelAndView memberAll(HttpServletRequest req){
		String mode = req.getParameter("mode");
		if (mode == null){
			mode = "all";
		}
		List<MemberDTO> list = null;
		if (mode.equals("all")){
			list = memberMapper.listMember();
		}else {
			String search = req.getParameter("search");
			String searchString = req.getParameter("searchString");
			list = memberMapper.findMember(search, searchString);
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("memberAll");
		mav.addObject("memberList", list);
		mav.addObject("mode", mode);
		return mav;
	}
	
	@RequestMapping("/member_delete.do")
	public ModelAndView memberDelete(@RequestParam int no){
		int res = memberMapper.deleteMember(no);
		String msg = null, url = null;
		if (res>0){
			msg = "ȸ����������!! ȸ������������� �̵��մϴ�.";
			url = "memberAll.do";
		}else {
			msg = "ȸ����������!! ȸ�������������� �̵��մϴ�.";
			url = "memberAll.do";
		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("message");
		return mav;
	}
	
	@RequestMapping(value="/member_edit.do", method=RequestMethod.GET)
	public ModelAndView memberEdit(@RequestParam int no){
		MemberDTO dto = memberMapper.getMember(no);
		ModelAndView mav = new ModelAndView
				("member_edit", "getMember", dto);
		return mav;
	}
	
	@RequestMapping(value="/member_edit.do", method=RequestMethod.POST)
	public ModelAndView memberEditOk
		(@ModelAttribute MemberDTO dto, BindingResult result){
		if(result.hasErrors()){
			dto.setNo(0);
		}
		int res = memberMapper.updateMember(dto);
		String msg = null, url = null;
		if (res>0){
			msg = "ȸ����������!! ȸ������������� �̵��մϴ�.";
			url = "memberAll.do";
		}else {
			msg = "ȸ����������!! ȸ�������������� �̵��մϴ�.";
			url = "memberAll.do";
		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("message");
		return mav;
	}
}









