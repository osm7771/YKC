package com.ykc.offer.offer.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.common.dao.YkcSeqDAO;
import com.ykc.offer.common.vo.YkcSeqVO;
import com.ykc.offer.member.vo.MemberVO;
import com.ykc.offer.offer.dao.OfferDAO;
import com.ykc.offer.offer.vo.OfferTypVO;
import com.ykc.offer.offer.vo.OfferVO;


@Service
public class OfferServiceImpl implements OfferService{

	@Autowired
	private OfferDAO offerDAO ;
	
	@Autowired
	private YkcSeqDAO seqDAO;
	
	
	@Override
	public List<Map<String, Object>> getTestOffer() {
		// TODO Auto-generated method stub
		return offerDAO.getTestOffer();
	}
	
	@Override
	public List<Map<String, Object>> getOfferTotalListByDateCd(OfferVO offerVO) {
		// TODO Auto-generated method stub
		return offerDAO.getOfferTotalListByDateCd(offerVO);
	}
	
	@Override
	public List<Map<String, Object>> getOfferTotalListByTyp(OfferVO offerVO) {
		// TODO Auto-generated method stub
		return offerDAO.getOfferTotalListByTyp(offerVO);
	}
	
	@Override
	public List<OfferTypVO> getOfferTypByCh(ChurchVo churchVo){		
		return offerDAO.getOfferTypByCh(churchVo);
	}
	
	@Override
	public List<String> getOfferDateList(OfferVO offerVO) {
		// TODO Auto-generated method stub
		return offerDAO.getOfferDateList(offerVO);
	}
	
	@Override
	public List<OfferVO> getOfferByMemberNo(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return offerDAO.getOfferByMemberNo(memberVO);
	}
	
	@Override	
	public int insertOffer(OfferVO offerVO) {
		// TODO Auto-generated method stub
		
		YkcSeqVO seqVO = new YkcSeqVO();
		
		seqVO.setTable_name("OFFER");
		seqVO.setSeq_id("SEQ");		
		
		offerVO.setSeq(seqDAO.getOfferSeq(seqVO));
		
		System.out.println("================= : " + offerVO.getSeq());
		
		return offerDAO.insertOffer(offerVO);
		
	}
	
	
}
