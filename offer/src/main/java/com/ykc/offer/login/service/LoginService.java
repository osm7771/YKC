package com.ykc.offer.login.service;

import com.ykc.offer.church.vo.ChurchVo;

public interface LoginService {
	
	public ChurchVo getChurchByIdPw(ChurchVo churchVo);
}
