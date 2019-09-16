package com.igeek;

public class Demo07 {

	public static void main(String[] args) {
		String str = "hello";
		
		String str2 = new String("hello");
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println(str==str2);//false
		
		String str3 = "hello";
		
		String str4 = new String("hello");
		
		System.out.println(str==str3);//true
		System.out.println(str2==str3);//false
		
		System.out.println(str2.equals(str));//true
		
		System.out.println(str2==str4);//false

	}

}
