package com.igeek;

public class Demo06 {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str);
		
		char[] chs = {'a','b','c','d','e','f'};
		String str1 = new String(chs);
		System.out.println(str1);
		
		String str2 = new String("hello");
		System.out.println(str2);
		
		String str3 = new String(chs,1,3);
		System.out.println(str3);

	}

}
