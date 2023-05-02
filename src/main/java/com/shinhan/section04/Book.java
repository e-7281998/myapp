package com.shinhan.section04;

import javax.annotation.processing.Generated;

import org.springframework.stereotype.Component;

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

@Component	//<bean id="book" class="com.shinhan.section04.Book"/> 과 같은 의미
//클래스명과 동일한데, 첫글자만 소문자로... id가 자동 생성 됨
public class Book {
	private String title;
	private int price;
	private String kind;
	
	 
	
}
