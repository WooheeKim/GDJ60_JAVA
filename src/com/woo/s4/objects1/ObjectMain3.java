package com.woo.s4.objects1;

import java.util.Scanner;

public class ObjectMain3 {

	public static void main(String[] args) {
		// n명의 학생 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력해주세요 : ");
		int count = sc.nextInt();
		
		Student [] students = new Student[count];
		Student [] students2 = new Student[count];
		
		Student student = new Student();
		for(int i=0;i<students.length;i++) {
			System.out.println(i+1+"번 째 학생의 이름 입력 : ");
			student.name = sc.next();
			students[i] = student;
		}
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
			System.out.println(students[i].name);
//			System.out.println(students2[i].name);
		}
		
		System.out.println("종료");
	}

}
