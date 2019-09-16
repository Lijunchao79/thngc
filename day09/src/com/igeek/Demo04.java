package com.igeek;

import java.util.ArrayList;

public class Demo04 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
		//拆箱
		Integer i1 = new Integer(20);
		Integer i2 = new Integer(30);
		System.out.println(i1+i2);
		
		int i4 = new Integer(13);
		System.out.println(i4);
		
		//自动装箱
		Integer i3 = 40;
		System.out.println(i3);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
//		arrayList.add("a123");
		arrayList.add(12);
		arrayList.add(16);
		

	}

}
