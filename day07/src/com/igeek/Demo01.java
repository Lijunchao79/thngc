package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:抽象类 abstract
 */
public abstract class Demo01 {
	
	int a;
	
	//抽象方法
	public abstract void print();
	
	//成员方法
	public void name() {
		System.out.println("成员方法");
	}
	
	public static void main(String[] args) {
		
		//Cannot instantiate the type Demo01
		//Demo01 demo01 = new Demo01();
	}

}
