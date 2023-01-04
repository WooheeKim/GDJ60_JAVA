package com.woo.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
		
		Archer archer = new Archer();
		
		Character character = null;
		
		character = archer;
		
		
		archer = (Archer)character;
		
		

	}

}
