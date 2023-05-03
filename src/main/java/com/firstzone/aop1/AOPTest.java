package com.firstzone.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("aop1.xml");
		Calculator cal = context.getBean("proxyCal", Calculator.class);
		//aop1.xml에 가면 확인 가능...
		//더하기에 보조업무 추가함
		cal.add(1,2);
		System.out.println("=================");
		//빼기에 보조업무 추가X
		cal.subtract(1,2);
		System.out.println("=================");
		//곱하기에 보조업무 추가X
		cal.multiply(2,1);
		System.out.println("=================");
		//나누기에 보조업무 추가함
		cal.divide(1,2);
	}
}
