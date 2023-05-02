package com.shinhan.section07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shinhan.section04.Book;
import com.shinhan.section04.EmpService;
import com.shinhan.section04.License;
import com.shinhan.section04.People;
import com.shinhan.section05.Car;

public class App07 {
	public static void main(String[] args) {
		//ApplicationContext : 로드시에 bean 생성
		ApplicationContext context = new ClassPathXmlApplicationContext("section4.xml");
		System.out.println("--------------------------------");
		DeptController controller = context.getBean("deptController", DeptController.class);
		controller.f1();
	}
}
