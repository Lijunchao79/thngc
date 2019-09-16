package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 方法的参数是引用类型：	形式参数的改变直接影响实际参数
 */
public class Demo26 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+";"+b);
		add(a, b);
		System.out.println(a+";"+b);

	}
	
	public static void add (int a,int b) {
		a++;
		b++;
		System.out.println(a+";"+b);
	}

}
