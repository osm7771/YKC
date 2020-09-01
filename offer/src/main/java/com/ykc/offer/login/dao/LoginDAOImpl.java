package com.ykc.offer.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ykc.offer.church.vo.ChurchVo;

@Repository
public class LoginDAOImpl implements LoginDAO{

	private static final String namespace = "com.ykc.offer.mapper.churchMapper";	 
	@Autowired
	private SqlSession sqlSession;	
	
	
	
	@Override
	public ChurchVo getChurchByIdPw(ChurchVo churchVo) {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne(namespace+".getChurchByIdPw",churchVo);
	}
	

}
