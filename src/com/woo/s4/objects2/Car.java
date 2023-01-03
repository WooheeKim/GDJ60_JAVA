package com.woo.s4.objects2;

public class Car {
	String company;
	String name;
	int price;
	String color;
	
	public Car() {
//		this("Black"); // 생성자 내에서 다른 생성자 호출
		this.company = "Audi";
		this.name = "A6";
		this.price = 5000;
		this.color = "Black";
	}
	
	public Car(String color) {
//		this(color, 3500);
		this.company = "Audi";
		this.name = "A6";
		this.price = 5000;
		this.color = color;
	}
	
	public Car(String color, int price) {
//		this(color,price,"A6");
		this.company = "Audi";
		this.name = "A6";
		this.price = price;
		this.color = color;
	}
	
	public Car(String color, int price, String name) {
		this.company = "Audi";
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Name : "+this.name);
		System.out.println("Price : "+this.price);
		System.out.println("Color : "+this.color);
	}
}
