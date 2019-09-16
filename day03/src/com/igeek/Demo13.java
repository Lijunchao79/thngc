package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @version 1.0
 * @description:
 *  char[] toCharArray():把字符串转换为字符数组
	String toLowerCase():把字符串转换为小写字符串
	String toUpperCase():把字符串转换为大写字符串
 */
public class Demo13 {
	public static void main(String[] args) {
		String str ="helloWorld";
		char[] chs = str.toCharArray();
		System.out.println(Arrays.toString(chs));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

}
