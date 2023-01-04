package com.woo.s4.objects5.characters;

public class Archer extends Character implements AttackAble {
	
	private int dex;
	
	public Archer() {
		super(""); // 생략 가능, 첫줄에 위치 해야함.
	}
	
	@Override
	public void attack() {
		System.out.println("활 공격");
	}
	
	public void move() {
		System.out.println("이동하기");
	}
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	
}
