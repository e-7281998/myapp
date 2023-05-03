package com.firstzone.review;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		f3();
	}
	
	private static void f3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("review.xml");
		Student s1 = context.getBean("my", Student.class);
		System.out.println(s1);
		//System.out.println(s1.getStudentName());
	}
	
	private static void f2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("review.xml");
	}

	private static void f1() {
		Resource resource = new ClassPathResource("review.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		//pom.xml의 id 넣기
		Student s1 = factory.getBean("student3", Student.class);
		System.out.println(s1);
		System.out.println(s1.getStudentName());
	}
}
