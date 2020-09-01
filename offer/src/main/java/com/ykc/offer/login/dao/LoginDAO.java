package com.ykc.offer.login.dao;

import com.ykc.offer.church.vo.ChurchVo;

public interface LoginDAO {	
	
	public ChurchVo getChurchByIdPw(ChurchVo churchVo);

}
