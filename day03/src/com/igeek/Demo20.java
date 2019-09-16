package com.igeek;

public class Demo20 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world");
		//StringBuilder ==> str
		String str = sb.toString();
		System.out.println(str);
		//str ==> StringBuilder
		String str2 = "java";
		StringBuilder sb2 = new StringBuilder(str2);
		System.out.println(sb2);
	}
}
