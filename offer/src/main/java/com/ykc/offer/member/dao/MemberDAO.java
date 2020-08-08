package com.ykc.offer.member.dao;

import java.util.List;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.member.vo.MemberVO;



public interface MemberDAO {	
	
	public List<MemberVO> getMemberListByChNo(ChurchVo churchVo);
	
	public MemberVO getMemberOne(MemberVO memberVO);
	

}
