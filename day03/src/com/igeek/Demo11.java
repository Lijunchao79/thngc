package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:遍历字符串
 */
public class Demo11 {

	public static void main(String[] args) {
		String s = "abcde";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
	}
}
