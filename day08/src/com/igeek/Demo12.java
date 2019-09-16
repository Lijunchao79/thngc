package com.igeek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 	在捕获异常时,可以使用父类异常的引用指向子类异常的对象.是多态的应用.
*  	当多异常处理时，捕获处理，前边的类不能是后边类的父类
 */
public class Demo12 {
	
	public static void main(String[] args) {
		//一个try多个catch的方式
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径：");
		String path = sc.next();
		
		try{
			System.out.println(10/0);
			FileWriter fw = new FileWriter(path);
		}
		catch(Exception ae) {
			System.out.println("您的除数不能为0");
		}
		
		
		System.out.println("后边的代码");
		
		//多个异常一次try一次catch,异常之间不能存在子父类关系
		
		/*Scanner sc = new Scanner(System.in);
		String path = sc.next();
		
		try {
			FileWriter fw = new FileWriter(path);
			System.out.println(10/0);
		}catch(IOException|Exception ae) {
			System.out.println("您访问的文件不存在!或者除数不能为0");
		}
		
		System.out.println("后边的代码");*/
		
	}

}
