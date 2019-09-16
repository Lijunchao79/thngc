package com.igeek_03;

import com.igeek.AccessClass;

//跨包的子类,public和protected可以
public class AccessDemo02 extends AccessClass{
	
	public static void main(String[] args) {
//		AccessClass accessClass = new AccessClass();
//		accessClass.method();
//		accessClass.method2();
//		accessClass.method3();
//		accessClass.method4();
		AccessDemo02 demo02 = new AccessDemo02();
		demo02.call();
	}
	
	public void call() {
//		super.method();
//		super.method2();
		super.method3();
		super.method4();
	}

}
