package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
 */
public class Demo02 {
	public static void main(String[] args) {
		
		Car a = new Byd();
		Car b = new Bm();
		a.run();
		b.run();
		System.out.println("************************");
		CarFactory carFactory = new CarFactory();
		Car aa = carFactory.getCar("bm");
		aa.run();
		System.out.println("************************");
		Car a1 = new BmFactory().getCar();
		Car a2 = new BydFactory().getCar();
		a1.run();
		a2.run();
		
	}
	

}
