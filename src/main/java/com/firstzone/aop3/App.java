package com.firstzone.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop3.xml");
		MemberRegister member  = context.getBean("memberRegister", MemberRegister.class);
	
		member.memberInfo();
		member.register();
		member.print();
		
		System.out.println("*********************");
		
		EmpRegister emp = context.getBean("emp", EmpRegister.class);
		emp.print("이태민 직원");
		emp.empInfo();
	}
}
