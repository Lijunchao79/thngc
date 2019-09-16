package com.igeek.ploy;

public class Dog extends Animal{

	@Override
	public void sleep() {
		System.out.println("睡在院子里");
	}
	
	@Override
	public void eat() {
		System.out.println("啃骨头");
	}
	
	public void shout() {
		System.out.println("旺旺....");
	}

}
