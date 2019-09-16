package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version 1.0
 * @description:利用StringBuilder完成字符串反转
 * 分析：
* 		A:键盘录入一个字符串
* 		B:写方法实现反转
* 			String -- StringBuilder -- reverse() -- String
* 		C:调用方法
* 		D:输出结果
 */
public class Demo22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串数据:");
		String str = scanner.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String str2 = sb.toString();
		System.out.println(str2);
	}

}
