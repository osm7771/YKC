package com.ykc.offer.offer.service;

import java.util.List;
import java.util.Map;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.member.vo.MemberVO;
import com.ykc.offer.offer.vo.OfferTypVO;
import com.ykc.offer.offer.vo.OfferVO;

public interface OfferService {
	
	public List<Map<String, Object>> getTestOffer();
	
	public List<Map<String, Object>> getOfferByDateCd(OfferVO offerVO);
	
	public List<OfferTypVO> getOfferTypByCh(ChurchVo churchVo);
	
	public List<String> getOfferDateList(OfferVO offerVO);
	
	public List<OfferVO> getOfferByMemberNo(MemberVO memberVO);
}
