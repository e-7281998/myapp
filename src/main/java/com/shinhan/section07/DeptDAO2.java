package com.shinhan.section07;

import org.springframework.stereotype.Repository;

//Bean 만들기 : Bean이란 ? Spring이 생성하고 소멸하는 것을 관리하는 객체
//1) xml 파일에 등록 : <bean id="deptDAO" class="com.shinhan.section07.DeptDAO"/>
//2) Annotation 사용 : meta data를 사용, 가독성이 좋다. @Component, @CRepository, @Service, @Controller
// context-component-scan 으로 패키지를 설정한다.

@Repository("deptDAO2")
public class DeptDAO2 implements DeptDAOInterface{
	
	@Override
	public void deptAll() {
		System.out.println("2. 모든 부서의 정보를 return 한다.");
	}
}
