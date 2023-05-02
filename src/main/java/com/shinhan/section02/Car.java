package com.shinhan.section02;

import org.springframework.stereotype.Component;

//Bean : Spring은 객체를 Bean이라고 한다. : Car c1 = new Car()
//POJO : Plain Old Java Object
//DTO : Data Transfer Object
//VO : value object

public class Car {
	private String model;
	private int price;
	public Car() {
		System.out.println("Car의 default 생성자");
	}
	
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
		System.out.println("Car의 argument 2개 생성자");
	} 

	public String getModel() {
		System.out.println("Car --- getModel()");
		return model;
	}

	public void setModel(String model) {
		System.out.println("Car --- setModel()");
		this.model = model;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	} 
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
}
