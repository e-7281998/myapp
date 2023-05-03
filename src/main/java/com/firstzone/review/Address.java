package com.firstzone.review;

import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
@NoArgsConstructor
public class Address {
	String city;
	String zipNum;
}
