package com.igeek.decorator;

//具体的装饰类
public class Milk extends Decorator{

	public Milk(Drink drink) {
		super(drink);
	}
	
	@Override
	public double cost() {
		return super.cost()*5;
	}
	
	@Override
	public String info() {
		return super.info()+"加奶";
	}
}
