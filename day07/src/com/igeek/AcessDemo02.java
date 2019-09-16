package com.igeek;

public class AcessDemo02 extends AccessClass {

	public static void main(String[] args) {
		// 同一包中(子类);private不行
		AccessClass accessClass = new AccessClass();
//		accessClass.method();
		accessClass.method2();
		accessClass.method3();
		accessClass.method4();

	}

}
