package com.ykc.offer.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ykc.offer.member.service.MemberService;
import com.ykc.offer.member.vo.MemberVO;



@Controller
@RequestMapping("/member/*")
public class MemberController {	
	@Autowired
	private MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public String main(Model model, MemberVO memberVO) {
		/**
		 * member 리스트
		 */
		
		List<MemberVO> mberList = memberService.getMemberList();
		
		model.addAttribute("mberList", mberList);
		
		return "member/list";
	}
	
	@RequestMapping(value = "/table", method=RequestMethod.GET)
	public String table(Model model, MemberVO memberVO) {
		/**
		 * member 리스트
		 */
		
		List<MemberVO> mberList = memberService.getMemberList();
		
		model.addAttribute("mberList", mberList);
		
		return "member/table";
	}
	
}
