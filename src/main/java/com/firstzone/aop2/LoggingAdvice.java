package com.firstzone.aop2;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//보조업무... Advice
@Component
@Aspect	//AspectJ로 사용
@Order(2)	//순서 n번째로 수행
public class LoggingAdvice{
	
	//pointcut 만들기
	@Pointcut("execution(* add(int)) || execution(* add(int, int))")
	public void targetMethod2() {}
	
	@Before("targetMethod2()")
	public void before(JoinPoint jp) {
		System.out.println("----------------- @before --------------------");
		System.out.println("[" + jp.getSignature().getName() + "]");
	}
	
	@After("targetMethod2()")
	public void after(JoinPoint jp) {
		System.out.println("----------------- @after --------------------");
	}
	
	@AfterReturning("targetMethod2()")
	public void afterReturn(JoinPoint jp) {
		System.out.println("----------------- @afterReturn --------------------"); 
	}
	
	//오류 났을 때
	@AfterThrowing("targetMethod2()")
	public void afterThrow() {
		System.out.println("----------------- @AfterThrowing --------------------");  
	}
	
	//주 업무의 전후에 수행
	@Around("targetMethod2()")
	public Object aroundTarget2(ProceedingJoinPoint joinPoint) throws Throwable {
		//joinPoint.getSignature().getName() : 메서드 이름
		System.out.println("[주 업무 전에 수행] " + joinPoint.getSignature().getName() + " 메서드");
		
		//... 다음을 쓰지 않으면 주업무에 가지 못함.. 필터에서 처럼..
		//--- 보조 업무가 주 업무에 끼어들었으므로 주 업무를 수행하도록 해야 한다.
		Object obj = joinPoint.proceed();
		
		System.out.println("[주 업무 후에 수행] " + joinPoint.getSignature().getName() + " 메서드");
		
		//리턴도 필수! 돌려줘야 하니까 ...
		//보조업무는 주업무 중간에 끼어드는 것...
		//그러므로 결과값(주업무를)을가지고 다시 돌아갈 수 있도록 돌려줘야(return) 함.
		return obj;
	} 
}