package com.ykc.offer.member.service;

import java.util.List;

import com.ykc.offer.member.vo.MemberVO;

public interface MemberService {
	
	public List<MemberVO> getMemberList ();
	
	public MemberVO getMemberOne (MemberVO memberVO);
}
