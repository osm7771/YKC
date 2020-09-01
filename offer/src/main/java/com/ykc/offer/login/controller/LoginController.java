package com.ykc.offer.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ykc.offer.church.vo.ChurchVo;
import com.ykc.offer.common.Church;
import com.ykc.offer.login.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	@Autowired	
	private LoginService loginService;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login/login", method = RequestMethod.GET)
	public String login() {
		
		return "login/login";
	}
	
	@RequestMapping(value = "/login/loginProcess", method = RequestMethod.GET)
	public String loginProcess(@Church ChurchVo churchVo,HttpServletRequest request) {
					
		System.out.println("-------------------------" + churchVo.getCh_id());
		System.out.println("-------------------------" + churchVo.getPassword());
		
		churchVo = loginService.getChurchByIdPw(churchVo);
		HttpSession session = request.getSession();
		if(churchVo != null) {
			churchVo.setPassword(null);
			session.setAttribute("CHURCH_INFO", churchVo);
			return "redirect:/main/main";
		}
		
		return "redirect:/login/login";
	}
	
}
