package com.shinhan.section02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.shinhan.section01.TV;

public class App {
	public static void main(String[] args) {
		f3();
	}
	
	public static void f4() {
		//classPath의 경로에 있어야 함. ClassPath가 포함되었으므로...
		ApplicationContext ctx = new ClassPathXmlApplicationContext("section2.xml");
		//언제든지 삼성TV로 바꿀 수 있다.
		//TV tv = ctx.getBean("samsung", TV.class);
		TV tv = ctx.getBean("lg", TV.class);
		tv.powerOn();
		tv.powerOff();
	}

	
	public static void f3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("section2.xml");
		People a = ctx.getBean("p2", People.class);
		People b = ctx.getBean("p2", People.class);
		
		//.xml에서...
		//scope = "singleton" 일 경우 같음 //주소 같음
		//scope = "prototype" 일 경우 다름 //주소 다름
		System.out.println(a==b); //주소 비교 
	}

	
	public static void f2() {
		//내가 : 사용 안해도 객체가 생성이 됨
		//ApplicationContext : 사용하기 전에 Bean을 미리 로딩
		//그래서 메모리를 많이 사용... 주로 모바일 환경에서 사용
		ApplicationContext ctx = new ClassPathXmlApplicationContext("section2.xml");
		//아래의 코드를 작성하지 않아도 객체가 생성됨을 볼 수 있음(지워보기)
		Car c1 = ctx.getBean("car1", Car.class);
		Car c2 = ctx.getBean("car2", Car.class);
		Car c3 = ctx.getBean("car3", Car.class);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	} 
	
	public static void f1() {
		//내가 : ClassPathResource는 내가 사용할 때 (객체가)만들어짐
		//즉, getBean을 해야 만들어짐
		Resource resource = new ClassPathResource("section2.xml");
		//BeanFactory : 사용하면 빈을 로딩
		//메모리 많이 사용하지 않음
		BeanFactory factory = new XmlBeanFactory(resource);
		//Bean이 id 주기
		Car c1 = (Car)factory.getBean("car1");
		System.out.println(c1);
		
		//type을 id 옆에 주면 타입변환하지 않아도 됨
		Car c2 = factory.getBean("car2", Car.class);
		System.out.println(c2);
		
		Car c3 = factory.getBean("car3", Car.class);
		System.out.println(c3);
	}
}
