package com.ykc.offer.offer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
@RequestMapping("/offer/*")
public class OfferController {	
	@Autowired	
	private OfferService offerService;
	@Autowired
	private MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(OfferController.class);

	@RequestMapping(value = "/resultMembTotal", method=RequestMethod.POST)
	public String resultMembTotal(@Church ChurchVo churchVo, Model model, HttpServletRequest request) {
		/**
		 * member 
		 */		
		
		String[] offerTypCds = request.getParameterValues("offer_typ_cd");
		List<String> cdList = new ArrayList<String>();
		String startY = request.getParameter("startY");
		String startM = request.getParameter("startM");
		
		String endY = request.getParameter("endY");
		String endM = request.getParameter("endM");
		
		logger.debug("--------------기간 : " + startY + startM + " ~ " + endY + endM );
		
		
		OfferVO offerVO = new OfferVO();
		
		for(int i=0; i<offerTypCds.length;i++){
			cdList.add(offerTypCds[i]);			
		}		
		offerVO.setCdList(cdList);
		
		offerVO.setStartYM(startY + startM);
		offerVO.setEndYM(endY + endM);		
		offerVO.setCh_no(churchVo.getCh_no());		
		offerVO.setOfferDateList(offerService.getOfferDateList(offerVO));
		
		List<Map<String, Object>> OfferList = offerService.getOfferByDateCd(offerVO);
		
		/*
		for(int i = 0; i<OfferList.size();i++){
			Map<String, Object> tmp = OfferList.get(i);
			byte[] bytes = (byte[])tmp.get("NAME");
			String nameStr = new String(bytes, StandardCharsets.UTF_8);
			tmp.put("NAME", nameStr);
		}	*/
		
		model.addAttribute("offerVO", offerVO);
		model.addAttribute("OfferList", OfferList);
		
		return "offer/resultMembTotal";
	}
	
	@RequestMapping(value = "/searchMembTotal", method=RequestMethod.GET)
	public String searchMembTotal( @Church ChurchVo churchVo, Model model,HttpServletRequest request) {
		/**
		 * offer 
		 */

		List<OfferTypVO> OfferTypList = offerService.getOfferTypByCh(churchVo);	
		model.addAttribute("OfferTypList", OfferTypList);
		
		return "offer/searchMembTotal";
	}
	
	
	@RequestMapping(value = "/membList", method=RequestMethod.GET)
	public String membList(@Church ChurchVo churchVo,Model model, HttpServletRequest request) {
		
		System.out.println("-------------------------- : " + churchVo.getCh_name());
				
		List<MemberVO> mberList = memberService.getMemberListByChNo(churchVo);
		
		model.addAttribute("mberList", mberList);
		
		return "offer/membList";
	}
	
	@RequestMapping(value = "/membOfferList", method=RequestMethod.POST)
	public String membOfferList(@Church ChurchVo churchVo, Model model, HttpServletRequest request, MemberVO memberVO) {
		
		memberVO.setCh_no(churchVo.getCh_no());
		List<OfferVO> offerList = offerService.getOfferByMemberNo(memberVO);
		List<OfferTypVO> OfferTypList = offerService.getOfferTypByCh(churchVo);			
		
		model.addAttribute("offerList", offerList);
		model.addAttribute("OfferTypList", OfferTypList);
		
		return "offer/membOfferList";
	}
	
	@RequestMapping(value = "/offerInsert", method=RequestMethod.POST)
	public String offerInsert(@Church ChurchVo churchVo, Model model, HttpServletRequest request, MemberVO memberVO, OfferVO offerVO) {
		
		System.out.println("--------------------------" + offerVO.getOffer_val());
		System.out.println("--------------------------" + offerVO.getOffer_dtm());
		System.out.println("--------------------------" + offerVO.getOffer_typ_cd());
		
		memberVO.setCh_no(churchVo.getCh_no());
		List<OfferVO> offerList = offerService.getOfferByMemberNo(memberVO);
		List<OfferTypVO> OfferTypList = offerService.getOfferTypByCh(churchVo);			
		
		model.addAttribute("offerList", offerList);
		model.addAttribute("OfferTypList", OfferTypList);
		
		return "offer/membOfferList";
	}
	
	
}
