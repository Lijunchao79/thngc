package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @version 1.0
 * @description: 
 *  去除字符串两端空格 
 * 		String trim() 
 *   按照指定符号分割字符串 
 * 		String[] split(String str)
 */
public class Demo15 {

	public static void main(String[] args) {
		// 创建字符串对象
		String s1 = "helloworld";
		String s2 = "  he lloworld  ";
		String s3 = "  hello  world  ";
		System.out.println(s1.trim());
		System.out.println(s2.trim());
		System.out.println(s3.trim());
		String s4 = "boo:and:foo";
		String[] strs = s4.split(":");
		for (String string : strs) {
			System.out.println(string);
		}

	}

}
