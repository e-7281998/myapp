package com.shinhan.section01;

public class TVUser {
	public static void main(String[] args) {
		f3();
	}
	
	//내가 new하지 않고, 공장이 알아서 new해서 보내줌
	public static void f3(){
		TV tv = TVFactory.makeTV("sam");
		tv.powerOn();
		tv.powerOff();
	}
	
	public static void f2(){
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
	}

	public static void f1(){
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
	}
}
