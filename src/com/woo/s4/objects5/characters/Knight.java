package com.woo.s4.objects5.characters;

public class Knight extends Character implements AttackAble {
	
	int Strong;
	
	Item item = new Staff();
	
	@Override
	public void attack() {
		item.a();
		
	}
	
	
}
