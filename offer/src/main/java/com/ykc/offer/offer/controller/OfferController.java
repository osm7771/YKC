package com.ykc.offer.offer.controller;

import java.nio.charset.StandardCharsets;
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
	
	private static final Logger logger = LoggerFactory.getLogger(OfferController.class);

	@RequestMapping(value = "/resultM", method=RequestMethod.POST)
	public String main(Model model, HttpServletRequest request) {
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
		offerVO.setOfferDateList(offerService.getOfferDateList(offerVO));
		
		List<Map<String, Object>> OfferList = offerService.getOfferByDateCd(offerVO);
		List<Map<String, Object>> testOfferList = offerService.getTestOffer();
		
		for(int i = 0; i<OfferList.size();i++){
			Map<String, Object> tmp = OfferList.get(i);
			byte[] bytes = (byte[])tmp.get("NAME");
			String nameStr = new String(bytes, StandardCharsets.UTF_8);
			tmp.put("NAME", nameStr);
		}	
		
		model.addAttribute("offerVO", offerVO);
		model.addAttribute("OfferList", OfferList);
		model.addAttribute("testOfferList", testOfferList);
		
		return "offer/resultM";
	}
	
	@RequestMapping(value = "/searchM", method=RequestMethod.GET)
	public String search(Model model,HttpServletRequest request) {
		/**
		 * offer 
		 */
		List<OfferTypVO> OfferTypList = offerService.getOfferTypByCh();	
		model.addAttribute("OfferTypList", OfferTypList);
		
		return "offer/searchM";
	}
	
	
}
