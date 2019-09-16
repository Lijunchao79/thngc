package com.igeek.decorator;

public class Sugar extends Decorator{

	public Sugar(Drink drink) {
		super(drink);
	}
	
	@Override
	public double cost() {
		return super.cost()*2;
	}
	
	@Override
	public String info() {
		return super.info()+"加糖";
	}

}
