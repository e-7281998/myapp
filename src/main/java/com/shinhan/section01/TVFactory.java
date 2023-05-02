package com.shinhan.section01;

public class TVFactory {
	public static TV makeTV(String brand) {
		//만들어서 보내기만 하자
		if(brand.equals("sam")) {
			return new SamsungTV();
		}else if(brand.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
