package com.ykc.offer.common;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ykc.offer.church.vo.ChurchVo;

@Aspect
@Component
public class ChAop {
	
	/*@Pointcut("execution(* com.ykc.offer.offer.*Controller.*(..)") 
	public void offerPoint() { 
		
	}
	
	
	@Before("offerPoint()")
	public void test() throws Throwable {
		System.out.println("----------------aop test--------------------");
		//HttpSession session = request.getSession();
		//ChurchVo churchVo = (ChurchVo)session.getAttribute("CHURCH_INFO");
		
		//System.out.println("---------------------- CH_NO : " + churchVo.getCh_no());
		
	}*/
	
	@Around("execution(* *(.., @Church (*), ..))")
	//@Around("@annotation(com.ykc.offer.common.Church)")
    public Object convertUser(ProceedingJoinPoint  joinPoint) throws Throwable {
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
        ChurchVo churchVo = (ChurchVo)session.getAttribute("CHURCH_INFO");
        Object retrunArgs[] = joinPoint.getArgs();
        
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //String[] parameterNames = signature.getParameterNames();
        Class[] parameterTyp = signature.getParameterTypes();
        
        if(churchVo != null) {
        	for(int i = 0;i<retrunArgs.length;i++){
            	String parameterTypStr = parameterTyp[i].getSimpleName();
            	if(parameterTypStr.equals("ChurchVo")) retrunArgs[i] = churchVo;
            }
        }  
        
        return joinPoint.proceed(retrunArgs);
    }
	
}
