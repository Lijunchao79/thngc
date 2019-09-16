package com.igeek;

public class Test2 {

	public static void main(String[] args) {
		
		Demo12 demo12 = new Demo12();
		//在调用泛型方法,并且传入实参的时候才能确定方法上形参的类型
		demo12.method(12);
		demo12.method("hi java");

	}

}
