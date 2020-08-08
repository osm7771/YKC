package com.ykc.offer.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.member.vo.MemberVO;


@Repository
public class MemberDAOImpl implements MemberDAO{

	private static final String namespace = "com.ykc.offer.mapper.memberMapper";	 
	@Autowired
	private SqlSession sqlSession;	
	
	@Override
	public List<MemberVO> getMemberListByChNo(ChurchVo churchVo) {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList(namespace+".getMemberListByChNo",churchVo);
	}
	
	@Override
	public MemberVO getMemberOne(MemberVO memberVO) {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne(namespace+".getMemberOne", memberVO);
	}
	

}
