package com.firstzone.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("my")	//Spring Bean으로 만들기 : 스캔만 없음
@ToString
@Getter
@Setter
public class Student {
	private String studentId;
	private String studentName;
	private String major;
	@Autowired	//만들어서 넣어줘라
	private Address addr;
	
	public Student() {
		System.out.println("Student default Constructor");
	}
	
	public Student(String studentId, String studentName, String major) {
		System.out.println("Student all Constructor");
 		this.studentId = studentId;
		this.studentName = studentName;
		this.major = major;
	}
	
}
