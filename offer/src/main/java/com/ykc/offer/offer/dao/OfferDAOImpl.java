package com.ykc.offer.offer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.member.vo.MemberVO;
import com.ykc.offer.offer.vo.OfferVO;
import com.ykc.offer.offer.vo.OfferTypVO;

@Repository
public class OfferDAOImpl implements OfferDAO{

	private static final String namespace = "com.ykc.offer.mapper.offerMapper";	 
	@Autowired
	private SqlSession sqlSession;	
	
	
	
	@Override
	public List<Map<String, Object>> getTestOffer() {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList(namespace+".getTestOffer");
	}
	
	@Override
	public List<Map<String, Object>> getOfferByDateCd(OfferVO offerVO) {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList(namespace+".getOfferByDateCd",offerVO);
	}
		
	@Override
	public List<OfferTypVO> getOfferTypByCh(ChurchVo churchVo){
		return sqlSession.selectList(namespace+".getOfferTypByCh",churchVo);
	}
	
	@Override
	public List<String> getOfferDateList(OfferVO offerVO){
		return sqlSession.selectList(namespace+".getOfferDateList",offerVO);
	}
	
	@Override
	public List<OfferVO> getOfferByMemberNo(MemberVO memberVO){
		return sqlSession.selectList(namespace+".getOfferByMemberNo",memberVO);
	}

}
