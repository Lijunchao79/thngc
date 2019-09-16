package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * Class 异常名 extends Exception{ //或继承RuntimeException
		public 异常名(){
		}
		public 异常名(String s){ 
			super(s); 
		}
	}
	
	try catch finally throws throw
	 
	Throwable
		Error
		Exception
			-- RunTimeException
			  ........
 */
public class Demo14{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄:");
		int age = scanner.nextInt();
		
		if (age < 18) {
			U18Exception u18Exception = new U18Exception("年龄小于18");
			//处理异常
			try {
				//抛出异常
				throw u18Exception;
			}catch (U18Exception e) {
				System.out.println("年龄不能小于18");
			}
			
			System.out.println("hi");
		}
		
		try {
			throw new RuntimeException("我抛了一个异常");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("hi exception");
		

	}

}
