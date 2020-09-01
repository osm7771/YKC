package com.ykc.offer.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.login.dao.LoginDAO;


@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO ;
	
	@Override
	public ChurchVo getChurchByIdPw(ChurchVo churchVo) {
		// TODO Auto-generated method stub
		return loginDAO.getChurchByIdPw(churchVo);
	}
	
}
