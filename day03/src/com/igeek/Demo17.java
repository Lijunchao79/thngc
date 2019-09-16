package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version 1.0
 * @description:
 * * 举例：键盘录入”abc”		
* 输出结果：”cba”
* 
* 分析：
* 		A:键盘录入一个字符串
* 		B:写方法实现字符串的反转
* 			a:把字符串倒着遍历，得到的每一个字符拼接成字符串。
* 			b:把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
* 		C:调用方法
* 		D:输出结果
 */
public class Demo17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符串数据:");
		String str = scanner.nextLine();
		
		char[] chs = str.toCharArray();
		
		String s = "";
		for (int i = chs.length-1; i >=0; i--) {
			s+=chs[i];
		}
		System.out.println(s);
	}

}
