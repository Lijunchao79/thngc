package com.igeek;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
//		Demo11 demo11 = new Demo11();
//		demo11.setTest("hi");
//		demo11.setTest(1234);
		
//		Demo11<Integer> demo11 = new Demo11<>();
//		demo11.setTest(123);
//		demo11.setTest("java");
		
//		SubDemo11 subDemo11 = new SubDemo11();
//		subDemo11.setTest(1234);
		
		SubDemo12<Integer> subDemo12 = new SubDemo12<>();
		subDemo12.setTest(12);
		
		//泛型不同的引用不能相互赋值
//		ArrayList<Integer> a1 = null;
//		ArrayList<String> a2 = null;
//		a2 = a1;
//		a1 = a2;
		
		Person p1 = new Person();
		Person p2 = p1;
		
	}

}
