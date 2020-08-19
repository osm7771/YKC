package com.ykc.offer.common.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ykc.offer.common.vo.YkcSeqVO;

@Repository
public class YkcSeqDAOImpl implements YkcSeqDAO{

	private static final String namespace = "com.ykc.offer.mapper.ykcSeqMapper";	 
	@Autowired
	private SqlSession sqlSession;		
	
	@Transactional	
	public int getOfferSeq(YkcSeqVO ykcSeqVO){
		sqlSession.update(namespace+".updateOfferSeq",ykcSeqVO);
		return sqlSession.selectOne(namespace+".getOfferSeq",ykcSeqVO);
	}

}
