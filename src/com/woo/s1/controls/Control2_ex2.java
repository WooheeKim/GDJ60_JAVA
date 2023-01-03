package com.woo.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		// char ch = ' ';
		// boolean check = false;
		
		System.out.println("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		total = kor+eng+math;
		avg = total/3.0;
		
		boolean flag = false;
		
		// 평균이 60점 이상인가?
		// 과목당 40점 미만이면 불합격
		// 합격 불합격 출력
		
		System.out.println("평균 점수는 "+avg+"입니다.");
		
//	1.	if(avg>=60 && kor>=40 && eng>=40 && math>=40) {
//			System.out.println("축하합니다. 합격입니다.");
//		} else {
//			System.out.println("아쉽게도 불합격입니다.");
//		}
//		
//	2.	if(avg>=60) {
//			if(kor>=40 && eng>=40 && math>=40) {
//				System.out.println("합격");
//			}else {
//				System.out.println("불합격");
//			}
//		}else {
//			System.out.println("불합격");
//		}
		
		if(avg>=60) {
			flag=true;
		}
		if(flag) {
		if(kor<40 || eng<40 || math<40) {
			flag=false;
		}else {
			flag=true;
			}
		}
		if(flag) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
	}

}
