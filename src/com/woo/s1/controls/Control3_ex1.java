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
			if(mp>40) {
				mp = 40;
			}
			
		} else if(select==3) {
			int a = random.nextInt(6);
			monsterHp = monsterHp-a;
			// 주문
			System.out.println("에너지볼 !");
			// 0~5 이하의 수치를 공격
			System.out.println(name + "은 "+ monsterName+"에게 "+a+"데미지를 주었다");
			
		} else if(select==4) {
			//주문
			System.out.println("매직클로 !");
			// mp 5씩 감소
			// 0~10 이하의 수치를 공격
			int a = random.nextInt(11);
			monsterHp = monsterHp-a;
			System.out.println(name + "은 "+ monsterName+"에게 "+a+"데미지를 주었다");
		} else {
			System.out.println("턴을 넘깁니다.");
		}
		
		// 몬스터가 나한테 주는 공격
		
		// 유저의 이름과 HP, MP 
		// 몬스터의 이름과 HP
		System.out.println(name+" HP: "+ hp +" /"+ " MP: "+mp );
		System.out.println(monsterName + " HP: "+monsterHp);
		// 1. HP보충(포션)  2. MP보충  3. 마법1  4. 마법2  5. 턴 넘기기
		// HP는 최대 40이 끝
		// 보충시 랜덤하게 0~40 사이의 숫자를 받아서 HP에 더하기
	}
}
