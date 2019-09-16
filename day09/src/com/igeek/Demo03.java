package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:包装类
 * 
 */
public class Demo03 {
	
	public static void main(String[] args) {
		int a = 10;
		//基本数据类型转成Integer对象
		Integer integer = new Integer(10);
		System.out.println(integer);
		Integer integer2 = Integer.valueOf(11);
		System.out.println(integer2);
		//Integer转成 int
		int i = integer.intValue();
		System.out.println(i);
		// int 类型和 String 类型之间互相转换
		int i2 = Integer.parseInt("123");
		System.out.println(i2);
		String str = Integer.toString(145);
		System.out.println(str);
		System.out.println("*******************");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
		
	}

}
