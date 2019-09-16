package com.igeek.utils;

/**
 * @author zx
 * @version 1.0
 * @descroption: 
 * 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
 * 这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 *  注意: 
 *   1、单例类只能有一个实例。
 *   2、单例类必须自己创建自己的唯一实例。 
 *   3、单例类必须给所有其他对象提供这一实例。
 * 
 *   构造函数是私有的。
 */
public class SingletonTest {

	public static void main(String[] args) {
		// The constructor Singleton() is not visible
		// Singleton singleton = new Singleton();
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton == singleton2);
		
		Singleton2 singleton22 = Singleton2.getInstance();
		Singleton2 singleton23 = Singleton2.getInstance();
		System.out.println(singleton22 == singleton23);
	}
}

// 饿汉式
class Singleton {

	// 1.私有化构造方法
	private Singleton() {
	}
	// 2.内部创建一个对象
	private static Singleton obj = new Singleton();

	// 3.提供一个公共的方法，返回对象
	public static Singleton getInstance() {
		return obj;
	}
}

// 懒汉式,线程不安全
class Singleton2 {

	// 1.私有化构造方法
	private Singleton2() {
	}
	
	//2.声明，未初始化
	private static Singleton2 singleton2 = null;
	
	// 3.提供一个公共的方法，返回对象
	public static Singleton2 getInstance() {
		if(singleton2 == null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}

}
