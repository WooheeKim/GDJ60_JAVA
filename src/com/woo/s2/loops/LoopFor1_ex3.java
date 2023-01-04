package com.woo.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int check = 0;
		
		// 로그인 총 5번 시도가능
		
		// 반복문 종료 후
		// 로그인이 성공했으면 "환영합니다." 메시지 출력
		// 로그인이 실패했으면 "은행을 방문해주세요." 출력

		int i=0;
		for(i=0;i<5;i++) {
			System.out.println("ID를 입력해주세요 : ");
			int yId = sc.nextInt();
			System.out.println("PW를 입력해주세요 : ");
			int yPw = sc.nextInt();
			
			if(id==yId && pw==yPw) {
				System.out.println("로그인 성공!");
				check = 1;
				i=1000; // or break;
			} else {
				System.out.println("로그인실패..");
			}
		}
		
		if(i>1000) {
		System.out.println("환영합니다.");
		} else {
		System.out.println("은행을 방문해주세요..");
		}
		
		System.out.println("반복문 종료");		
	}
}
