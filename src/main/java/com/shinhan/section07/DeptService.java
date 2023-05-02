package com.shinhan.section07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("deptService")	//@Component + service 역할
public class DeptService {
	//의존관계가 강하다. : DeptDAO deptDAO = new DeptDAO()
	@Autowired	 //그러므로 Atowired를 사용하면 됨. 주는대로 받음
	//작성 위치는 field(가장 일반적), 생성자, setter 모두 가능하다.
	//type이 같으면 자동 주입됨
	//만약 같은 타입이 여러개 있다면 다음과 같이 @Qualifier로 이름 설정해줌(구별해줌) ...interface 구현한 경우
	@Qualifier("deptDAO")
	DeptDAOInterface dao;
	
	public void work() {
		dao.deptAll();
	}
}
