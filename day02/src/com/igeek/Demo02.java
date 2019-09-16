package com.igeek;

/**
 * @author Administrator
 * if(关系表达式) {
		     语句体
	}
 */
public class Demo02 {

	public static void main(String[] args) {
		
		int a =11;
		int b = 20;
		
		if(a==b) {
			System.out.println("a==b");
		}else if(a<b) {
			System.out.println("a<b");
		}
		
		if(a%2 ==0) {
			System.out.println(a+"是偶数");
		}else {
			System.out.println(a+"是奇数");
		}

	}

}