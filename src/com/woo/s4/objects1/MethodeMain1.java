package com.woo.s4.objects1;

public class MethodeMain1 {

	public static void main(String[] args) {
		System.out.println("Main Method 실행");
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 = new MethodTest3();
		Sword sword = new Sword(); 
		
		int salary = 3000000;
		// 호출시 매개변수로 보내는 값 : 인자값
		mt3.t3(salary,0.95);
		
		sword.name="집행검";
		sword.damage=500;
		sword.life=200;
		sword.price=50000;
		sword.level=3;
		
		mt3.info(sword);
		
		System.out.println(sword.name);
		
		System.out.println("main : "+salary);
		
		// 메서드를 호출한다.
//		mt.t1();
		
		
		System.out.println("Main Method 종료");
	}

}
