package com.woo.s4.objects4;

public final class God {
	
	private static final String MY_NAME="";
	
	private static God god;
	
	private God() {
		this.name="test";
	}
	
	public static God getInstance() {
		if(God.god == null) {
			God.god = new God();
		}
		
		return God.god; //new God();
		
		
	}
	
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
	
}
