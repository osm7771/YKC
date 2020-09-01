package filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.filter.OncePerRequestFilter;

import com.ykc.offer.church.vo.ChurchVo;

public class YkcFilter extends OncePerRequestFilter{
	
	
	@Override
	protected void initFilterBean() throws ServletException {
		// TODO Auto-generated method stub
		super.initFilterBean();
	}
	

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//System.out.println("----------YkcFilter---------");
		HttpSession session = ((HttpServletRequest)request).getSession();
		
		//ChurchVo churchInfo = (ChurchVo)session.getAttribute("CHURCH_INFO");
				
		/*
		if(churchInfo == null){
			churchInfo = new ChurchVo();
			
			churchInfo.setCh_addr("강원도 원주시 우무개로 317-13");
			churchInfo.setCh_id("ykc");
			churchInfo.setCh_name("영광침례교회");
			churchInfo.setCh_no("CH00001");
			churchInfo.setCh_telno("0337472179");
			
			session.setAttribute("CHURCH_INFO", churchInfo);
		}
		*/
		filterChain.doFilter(request, response);
	}		
}
