package com.shinhan.section04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shinhan.section05.Car;

public class App04 {
	public static void main(String[] args) {
		//ApplicationContext : 로드시에 bean 생성
		ApplicationContext context = new ClassPathXmlApplicationContext("section4.xml");
		
		Book b1 = context.getBean("book", Book.class);
		Car c1 = context.getBean("mycar", Car.class);
		System.out.println(b1);
		License li = context.getBean("license",License.class);
		//System.out.println(b1);
		//System.out.println(c1);
		//System.out.println(li);
		
		People p1 = context.getBean("people", People.class);
		System.out.println(p1);
		EmpService service = context.getBean("empSer", EmpService.class);
		service.empAll();
	}
	
}
