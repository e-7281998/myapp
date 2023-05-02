package com.shinhan.section04;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shinhan.section05.Car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Component
public class People {
 	private String name;
	private int age;
	@Autowired
	//type이 같으면 자동으로 주입한다.
	private Car car;
	private List<String> major;
	private List<License> licenseList;
	private Map<String, Book> books;
	
	Set<String> friend;
	//Properties도 map의 일종임
	Properties myprofile;
	 
	//기본생성자는 생성자가 정의되지 않은 경우 컴파일 시 자동으로 만들어준다.
	//그래서 다음고 같이 작성안해도 상관없음.
	 

	 
}
