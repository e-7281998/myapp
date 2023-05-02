package com.shinhan.section01;

public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"전원켠다");
	}
	@Override
	public void powerOff() {
		System.out.println(this.getClass().getSimpleName()+"전원끈다");

	}
}
