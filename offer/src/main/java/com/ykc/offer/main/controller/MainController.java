package com.ykc.offer.main.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.common.Church;
import com.ykc.offer.member.service.MemberService;
import com.ykc.offer.member.vo.MemberVO;
import com.ykc.offer.offer.service.OfferService;
import com.ykc.offer.offer.vo.OfferTypVO;
import com.ykc.offer.offer.vo.OfferVO;



@Controller
public class MainController {	
	@Autowired	
	private OfferService offerService;
	@Autowired
	private MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String searchMembTotal( @Church ChurchVo churchVo, Model model,HttpServletRequest request) {
		/**
		 *  
		 */
		
		
		return "redirect:main/main";
	}

	@RequestMapping(value = "/main/main", method=RequestMethod.GET)
	public String resultMembTotal(@Church ChurchVo churchVo, Model model, HttpServletRequest request) {
		/**
		 * main 
		 */			
		
		return "main/main";
	}	
}
