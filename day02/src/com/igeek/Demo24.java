package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:方法的重载
 * 参数个数或者参数类型
 */
public class Demo24 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = add(a, b);
		System.out.println(c);
		double d = add(12.4, 12.5);
		System.out.println(d);
		int e = add(12, 123, 34);
		System.out.println(e);
	}
	
	public static int add(int a,int b){
		return a+b;
	}
	
	public static double add(int a,double b){
		return a+b;
	}
	
	public static double add(double a,double b){
		return a+b;
	}
	
	public static int add(int a,int b,int c){
		return a+b+c;
	}

}
