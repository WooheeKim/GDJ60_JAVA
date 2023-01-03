package com.woo.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// Game : TRPG
		// 법사
		String name = "핫팩";
		int hp = 20;
		int mp = 20;
		
		String monsterName = "오크";
		int monsterHp = 10;
		
		System.out.println("1. HP 보충");
		System.out.println("2. MP 보충");
		System.out.println("3. 마법1 사용");
		System.out.println("4. 마법2 사용");
		System.out.println("5. 턴 종료");		
		int select = sc.nextInt();
		
		if(select==1) {
			int h = random.nextInt(41);
			hp = hp+h; // 20
			if(hp>40) {
				hp = 40;
			}
			System.out.println(hp);
		} else if(select==2) {
			int m = random.nextInt(41);
			mp = mp+m;
			if(mp>40) {
				mp = 40;
			}
			System.out.println(mp);
		} else if(select==3) {
			int a = random.nextInt(6);
			monsterHp = monsterHp-a;
			System.out.println(name + "은"+monsterName+"에게"+a);
			// 주문
			// mp 3씩 감소
			// 0~5 이하의 수치를 공격
			System.out.println("에너지볼 !");
			int magic1 = 0;
			
			if(magic1>=1) {
				magic1 = mp-3; 
				System.out.println(magic1);
				random.nextInt();
			}
			

		} else if(select==4) {
			//주문
			// mp 5씩 감소
			// 0~10 이하의 수치를 공격
			System.out.println("매직클로 !");
			
		} else {
			System.out.println("턴을 넘깁니다.");
		}
		
		// 몬스터가 나한테 주는 공격
		
		// 유저의 이름과 HP, MP 
		// 몬스터의 이름과 HP
		System.out.println(name + "HP :"+hp + "MP: "+mp );
		System.out.println(monsterName + "HP :"+hp + "MP: "+mp );
		// 1. HP보충(포션)  2. MP보충  3. 마법1  4. 마법2  5. 턴 넘기기
		// HP는 최대 40이 끝
		// 보충시 랜덤하게 0~40 사이의 숫자를 받아서 HP에 더하기
		
//		int hpR = 0;
//		int mpB = 0;
//		String magic = "마법1";
//		String magic2 = "마법2";
//		String turn = "다음 턴";
//		
//		System.out.println("1. HP보충(포션)  2. MP보충  3. 마법1  4. 마법2  5. 턴 넘기기");
//		hpR = sc.nextInt();
//		mpB = sc.nextInt();
//		magic = sc.next();
//		System.out.println("마법1 사용");
//		magic = sc.next();
//		System.out.println("마법2 사용");
//		turn = sc.next();
//		System.out.println("다음 턴");
//		
//		
//		hpR = hp + random.nextInt(41);
//		mpB = mp + random.nextInt(41);
//		if(hpR<=40) {
//			System.out.println("HP가 회복되었습니다.");
//		} else {
//			System.out.println("HP가 최대로 회복되었습니다.");
//		}
//		if(mpB<=40) {
//			System.out.println("MP가 회복되었습니다.");
//		} else {
//			System.out.println("MP가 최대로 회복되었습니다.");
//		}
		
		
		
		
//		int test = random.nextInt(5); // 0~5 미만의 정수하나를 리턴
//		int test2 = random.nextInt(31);
//		System.out.println("test : "+test);
//		System.out.println("test2 : "+test2);
//		
//		System.out.println("마법1을 사용하였습니다.");
//		System.out.println("마법2를 사용하였습니다. ");
	}
}
