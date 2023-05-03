package com.firstzone.aop2;

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

@Component
@Aspect
@Order(3)
public class MyAdvice{

	@Pointcut("execution(* *(int, int))")
	public void pointcutMethod() {}

	@Before("pointcutMethod()")
	public void before() {
		System.out.println("------------MyAdvice @Before-------------");
	}
	
	@After("pointcutMethod()")
	public void after() {
		System.out.println("------------MyAdvice @After-------------");
	}
	
	@AfterReturning("pointcutMethod()")
	public void afterReturning() {
		System.out.println("------------MyAdvice @afterReturning-------------");
	}
	
	@AfterThrowing("pointcutMethod()")
	public void afterThrowing() {
		System.out.println("------------MyAdvice @AfterThrowing-------------");
	}
	
	@Around("pointcutMethod()")
	public Object around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("=============MyAdvice @Around==============");
		System.out.println("함수 이름은 : " + jp.getSignature().getName());
	
		Object object = jp.proceed();
		
		System.out.println("=============================================");
		
		return object;
	}

}
