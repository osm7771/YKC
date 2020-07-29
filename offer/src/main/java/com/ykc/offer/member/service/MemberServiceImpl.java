package com.ykc.offer.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ykc.offer.member.dao.MemberDAO;
import com.ykc.offer.member.vo.MemberVO;


@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO memberDAO ;
	
	
	@Override
	public List<MemberVO> getMemberList () {
		// TODO Auto-generated method stub
		return memberDAO.getMemberList();
	}
	
	@Override
	public MemberVO getMemberOne (MemberVO memberVO) {
		// TODO Auto-generated method stub
		return memberDAO.getMemberOne(memberVO);
	}
	
	
}
