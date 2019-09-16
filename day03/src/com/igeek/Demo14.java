package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 键盘录入一个字符串，把该字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 */
public class Demo14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串数据:");
		String str = scanner.nextLine();
		
		String s1 = str.substring(0,1);
		String s2 = str.substring(1);
		
		System.out.println(s1.toUpperCase()+s2.toLowerCase());

	}

}
