package com.firstzone.aop1;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyAdvice implements MethodBeforeAdvice{

	//주 업무 수행하기 전
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("=============MethodBeforeAdvice==============");
		System.out.println("함수 이름은 : " + method.getName());
		System.out.println("=============================================");
	}

}
