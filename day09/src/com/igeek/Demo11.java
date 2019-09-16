package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:泛型类
 */
public class Demo11<T>{
	
	int id;
	String name;
	
	//类内部可以使用泛型的类
	T test;

	public Demo11() {
	}

	public Demo11(int id, String name, T test) {
		this.id = id;
		this.name = name;
		this.test = test;
	}
	
	public void setTest(T test) {
		this.test = test;
	}
	
	public T getTest() {
		return test;
	}
	
	//静态方法的中不要使用
//	public static void name(T tt) {
//		System.out.println(tt);
//	}
	
	

}
