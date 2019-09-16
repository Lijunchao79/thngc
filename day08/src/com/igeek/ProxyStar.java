package com.igeek;

public class ProxyStar implements Star{
	
	private Star star;
	
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}
	
	public void communicate() {
		System.out.println("出场费");
	}

	@Override
	public void actor() {
		star.actor();
	}

	@Override
	public void sing() {
		star.sing();
	}

}
