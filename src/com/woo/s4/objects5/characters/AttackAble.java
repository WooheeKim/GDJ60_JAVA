package com.woo.s4.objects5.characters;

public interface AttackAble {
	
	// 상수
	public static final int DAMAGE = 1;
	
	// 추상메서드
	// 접근지정자 무조건 public (생략가능)
	// 그외지정자 : abstract (생략가능)
	public abstract void attack();
//	abstract void attack2();
//	void attack3();
//	public void attack4();
	
}
