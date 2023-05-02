package com.shinhan.section02;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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

public class People {
	private String name;
	private int age;
	private Car car;
	private List<String> major;
	private List<License> licenseList;
	private Map<String, Book> books;
	
	Set<String> friend;
	//Properties도 map의 일종임
	Properties myprofile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<String> getMajor() {
		return major;
	}
	public void setMajor(List<String> major) {
		this.major = major;
	}
	public List<License> getLicenseList() {
		return licenseList;
	}
	public void setLicenseList(List<License> licenseList) {
		this.licenseList = licenseList;
	}
	public Map<String, Book> getBooks() {
		return books;
	}
	public void setBooks(Map<String, Book> books) {
		this.books = books;
	}
	public Set<String> getFriend() {
		return friend;
	}
	public void setFriend(Set<String> friend) {
		this.friend = friend;
	}
	public Properties getMyprofile() {
		return myprofile;
	}
	public void setMyprofile(Properties myprofile) {
		this.myprofile = myprofile;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", car=" + car + ", major=" + major + ", licenseList="
				+ licenseList + ", books=" + books + ", friend=" + friend + ", myprofile=" + myprofile + "]";
	}

	//기본생성자는 생성자가 정의되지 않은 경우 컴파일 시 자동으로 만들어준다.
	//그래서 다음고 같이 작성안해도 상관없음.
	 

	 
}
