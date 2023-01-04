package com.woo.s4.objects5.characters;

public abstract class Magition extends Character {

	private int mp;
	
	public Magition() {
		super("");
	}
	
	public void attack() {
		System.out.println("마법 공격");
	}
	
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public abstract void spell();
		
	
}
