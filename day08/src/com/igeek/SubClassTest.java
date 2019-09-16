package com.igeek;

public class SubClassTest {
	
	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		//1.接口中的静态方法，通过接口来调用
		Demo03.method1();
		//2.通过实现的对象，可以调用默认方法
		//3.实现的类的对象，重写了接口中的默认方法，调用的是重写后的方法
		//4.父类和接口具有同名参数的方法的时候---》（子类没有重写）类优先原则
		subClass.method2();
		subClass.method3();
		subClass.myMethod();
	}
}
/**
 * Duplicate default methods named method2 with the parameters () 
 * and () are inherited from the types Demo04 and Demo03
 */
class SubClass extends SuperClass implements Demo03{

	@Override
	public void method2() {
		System.out.println("SubClass method2....");
	}
	
	public void myMethod() {
		method2();
		super.method2();
		//5.调用接口中的默认方法
		Demo03.super.method2();
	}
	
	
}
