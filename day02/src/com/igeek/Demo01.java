package com.igeek;

/**
 * @author Administrator
 * 
 * 修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2…) {
			方法体;
			return 返回值;
   }
 * 
 * 修饰符:public
 * 
 * 返回值类型 ：void
 * 
 */
public class Demo01 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		int c = add(a, b);
//		System.out.println(c);
		
		Demo01 demo01 = new Demo01();
		int d = demo01.add(a, b);
		System.out.println(d);
	}
	
	public int add(int a,int b) {
		return a+b;
	}

}