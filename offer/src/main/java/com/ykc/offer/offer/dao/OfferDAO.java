package com.ykc.offer.offer.dao;

import java.util.List;
import java.util.Map;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.member.vo.MemberVO;
import com.ykc.offer.offer.vo.OfferVO;
import com.ykc.offer.offer.vo.OfferTypVO;

public interface OfferDAO {	
	
	public List<Map<String, Object>> getTestOffer();
	public List<Map<String, Object>> getOfferTotalListByDateCd(OfferVO offerVO);
	public List<Map<String, Object>> getOfferTotalListByTyp(OfferVO offerVO);
	public List<OfferTypVO> getOfferTypByCh(ChurchVo churchVo);
	public List<String> getOfferDateList(OfferVO offerVO);
	public List<OfferVO> getOfferByMemberNo(MemberVO memberVO);
	public int insertOffer(OfferVO offerVO);

}
