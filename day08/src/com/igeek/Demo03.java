package com.igeek;

//1.常量 2.抽象方法
//JDK1.8之后，接口可以定义 静态方法，和默认方法
public interface Demo03 {

	// 静态方法
	public static void method1() {
		System.out.println("method1....");
	}

	// 默认方法
	public default void method2() {
		System.out.println("Demo03 method2....");
	}

	// 默认方法
	default void method3() {
		System.out.println("method3....");
	}
	
}
