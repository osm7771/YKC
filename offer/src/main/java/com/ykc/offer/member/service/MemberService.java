package com.ykc.offer.member.service;

import java.util.List;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.member.vo.MemberVO;

public interface MemberService {
	
	public List<MemberVO> getMemberListByChNo(ChurchVo churchVo);
	
	public MemberVO getMemberOne (MemberVO memberVO);
}
