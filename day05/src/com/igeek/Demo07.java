package com.igeek;

import java.io.File;

/**
 * @author Administrator
 *	需求:打印文件的名称（包括子孙目录）
 *  递归: Recurison,自己调用自己
 */
public class Demo07 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("*********************");
		printNumber(1);
		System.out.println();
		System.out.println("*********************");
		printName(new File("D:\\thngc-workspace\\day05"));

	}
	
	//打印1~10
	//1 2 3 ........
	public static void printNumber(int n) {
		if(n > 10) {
			return;
		}
		System.out.print(n+" ");
		printNumber(n+1);
	}
	
	//打印文件的名称
	public static void printName(File file) {
		System.out.println(file.getName());
		if( (null == file) || (!file.exists())) {
			return;
		}else if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				printName(file2);
			}
		}
	}

}
