package com.igeek.decorator;

public class Juice implements Drink{
	
	String name = "果汁";

	@Override
	public double cost() {
		return 20;
	}

	@Override
	public String info() {
		return name;
	}

}
