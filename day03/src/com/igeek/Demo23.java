package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:  判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 */
public class Demo23 {

	public static void main(String[] args) {
		boolean flag = isEqual("mnanm");
		System.out.println(flag);
	}
	
	public static boolean isEqual(String str) {
		StringBuilder sb = new StringBuilder(str);
		//aba ==> aba
		sb.reverse();
		String str2 = sb.toString();
		if(str.equals(str2)) {
			return true;
		}else {
			return false;
		}
	}

}
