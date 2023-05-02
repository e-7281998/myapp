package com.shinhan.section04;

import org.springframework.stereotype.Repository;

//Component(객체)이면서 데이터를 Access하는 Object를 Repository라고 함
@Repository
public class EmpDAO {
	
	public EmpDAO() {
		System.out.println("EmpDAO default 생성자");
	}

	public void selectAll() {
		System.out.println("모든 직원을 조회한다.");
	}
}
