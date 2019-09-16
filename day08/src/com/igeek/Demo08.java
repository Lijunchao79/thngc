package com.igeek;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 
 * try{
		需要检测的异常；
	}  catch(异常类名异常变量) {
		异常处理代码
		可以调用异常的方法
		通常我们只使用一个方法：printStackTrace打印异常信息
	}
 */
public class Demo08 {
	
	public static void main(String[] args) {
		//java.lang.ArithmeticException: / by zero
		try {
			//System.out.println(1/0);
			int[] arr = {1,2,3};
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			//java.lang.ArrayIndexOutOfBoundsException
			System.out.println(arr[3]);
		} 
		//Unreachable catch block for ArithmeticException. 
		//It is already handled by the catch block for Exception
		catch (ArithmeticException e) {
			System.out.println("算数异常");
			//e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常");
		} 
		catch (Exception e) {
			System.out.println("异常");
		}
//		System.out.println(1/0);
		System.out.println("hi");
		
		//编译时异常:在编译时必须进行处理,不处理无法通过编译.
//		try {
//			FileWriter fw = new FileWriter("a.txt");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
