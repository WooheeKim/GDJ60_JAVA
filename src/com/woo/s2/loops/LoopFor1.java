package com.woo.s2.loops;

import java.util.Scanner;

public class LoopFor1 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("반복문의 횟수를 입력하세요 : ");
		int count=sc.nextInt();
		
		for(int i=1;i<=count;i++) {
			System.out.println("Hello World");
			System.out.println("Good Bye");
			System.out.println(i);
		}
//		System.out.println(i);
		
		System.out.println("Finish");
	}

}
