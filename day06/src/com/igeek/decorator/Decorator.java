package com.igeek.decorator;

//抽象装饰类
public abstract class Decorator implements Drink{
	
	//抽象组件的引用
	private Drink drink;
	
	public Decorator(Drink drink) {
		super();
		this.drink = drink;
	}

	@Override
	public double cost() {
		return drink.cost();
	}
	
	@Override
	public String info() {
		return drink.info();
	}

}
