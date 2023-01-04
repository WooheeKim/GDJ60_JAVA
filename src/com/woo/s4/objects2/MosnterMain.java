package com.woo.s4.objects2;

public class MosnterMain {

	public static void main(String[] args) {
		Monster mon1 = new Monster(); // Monster(); = 생성자(Constructor) 메서드
		
		mon1.power=10;
		mon1.hp=100;
		Monster mon2 = new Monster();
		mon2.power=10;
		mon2.hp=90;
		
		System.out.println(mon1 == mon2);
		boolean result = mon2.checkValue(mon1);
		System.out.println("Result : "+result);
		
//		System.out.println(mon1);
//		mon1.info();
//		System.out.println(mon2);
//		mon2.info();

	}

}
