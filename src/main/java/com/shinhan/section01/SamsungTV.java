package com.shinhan.section01;

public class SamsungTV implements TV{
	private String model;
	
	public SamsungTV() {
		System.out.println("삼성TV 기본 생성자");
	}
	
	public SamsungTV(String model) {
		System.out.println("삼성TV arg 1개 생성자");
 	}
 
	@Override
	public String toString() {
		return "SamsungTV [model=" + model + "]";
	}

	@Override
	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"전원켠다");
	}
	@Override
	public void powerOff() {
		System.out.println(this.getClass().getSimpleName()+"전원끈다");

	}
}
