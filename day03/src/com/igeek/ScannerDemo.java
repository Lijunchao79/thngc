package com.igeek;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 接收数据
		System.out.println("请输入一个字符串数据：");
		String s = sc.nextLine();

		// 输出结果
		System.out.println("s:" + s);

	}

}
