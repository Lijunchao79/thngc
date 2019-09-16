package com.igeek.decorator;

/**装饰 Decorator Pattern
 * 1.抽象组件需要被装饰的抽象对象(接口/抽象类)
 * 2.具体组件（被装饰的对象）
 * 3.抽象的装饰类(包含了对抽象组件的引用以及装饰的方法)
 * 4.具体的装饰类
 */
public class Test {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		System.out.println(coffee.info()+"==>"+coffee.cost());
		
		Milk milk = new Milk(coffee);
		System.out.println(milk.info()+"==>"+milk.cost());
		
		Sugar sugar = new Sugar(milk);
		System.out.println(sugar.info()+"==>"+sugar.cost());
		
		Juice juice = new Juice();
		System.out.println(juice.info()+"==>"+juice.cost());
		Sugar sugar2 = new Sugar(juice);
		System.out.println(sugar2.info()+"==>"+sugar2.cost());
		Milk milk2 = new Milk(sugar2);
		System.out.println(milk2.info()+"==>"+milk2.cost());

	}

}
