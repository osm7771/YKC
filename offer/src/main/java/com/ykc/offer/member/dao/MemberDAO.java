package com.ykc.offer.member.dao;

import java.util.List;

import com.ykc.offer.member.vo.MemberVO;



public interface MemberDAO {	
	
	public List<MemberVO> getMemberList();
	
	public MemberVO getMemberOne(MemberVO memberVO);
	

}
