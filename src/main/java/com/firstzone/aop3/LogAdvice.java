package com.firstzone.aop3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {
	
	//@Pointcut("within(com.firstzone.aop3.*)")
	@Pointcut("execution(* print(..))")
	public void cut1() {}
	
	@Pointcut("execution(* *Info())")
	public void cut2() {}
	
	@Around("cut2()")
	public Object around2(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("-- cut2 주 업무 시작 전 (calss 이름) "+ jp.getTarget().getClass().getName());
		Object obj = jp.proceed();
		System.out.println("-- cut2 주 업무 시작 후 (함수 이름) "+ jp.getSignature().getName());
		return obj;
	}
	
	@Around("cut1()")
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("-- cut1 주 업무 시작 전 (calss 이름) "+ jp.getTarget().getClass().getName());
		Object obj = jp.proceed();
		System.out.println("-- cut1 주 업무 시작 후 (함수 이름) "+ jp.getSignature().getName());
		return obj;
	}
	
}
