package com.woo.s4.objects1;

public class ObjectsMain {

	public static void main(String[] args) {
		
		System.out.println("Start");
		// main은 프로그램을 실행 목적
		// Test 목적
		// main은 어느 클래스 안에 있던지 상관없음
		
		// 학생 한 명 생성
		// 객체 생성
		// 변수선언과 거의 동일
		// 클래스명 변수명 = new 클래스명();
		Student student = new Student();
		student.name="IU";
		student.num=20;
		student.kor=80;
		student.eng=76;
		student.math=82;
		System.out.println(student);
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.kor);
		System.out.println(student.eng);
		System.out.println(student.math);
		System.out.println(student.avg);
		
		// 학생 객체 생성
		Student student2 = new Student();
		student2.name="김우희";
		student2.num=28;
		student2.kor=94;
		student2.eng=86;
		student2.math=88;
		System.out.println(student2.name);
		System.out.println(student2.num);
		System.out.println(student2.kor);
		System.out.println(student2.eng);
		System.out.println(student2.math);
		int a = 20;
		int b = 10;
		
		a=b;
		System.out.println(student==student2);
		
		student = student2;
		System.out.println(student.name);
		student.name = "winter";
		System.out.println(student2.name);
		
		// 가비지 collector
		
		System.out.println("Finish");
	}

}
