package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * boolean equals(Object obj):比较字符串的内容是否相同
   boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
   boolean startsWith(String str):判断字符串对象是否以指定的str开头
   boolean endsWith(String str):判断字符串对象是否以指定的str结尾
 */
public class Demo08 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "java";
		String s4 = "JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println("*****************");
		System.out.println(s3.equals(s4));
		System.out.println(s4.equalsIgnoreCase(s3));
		System.out.println("*****************");
		System.out.println(s1.startsWith("ehel"));
		System.out.println(s1.endsWith("o"));

	}

}
