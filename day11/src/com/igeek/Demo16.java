package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 求N的阶乘,以5的阶乘为例
	5*4*3*2*1
	5! = 5 * 4!;
		4! = 4 * 3!;
			3! = 3 * 2!;
				2!= 2 * 1!;
					1! = 1; 
 */
public class Demo16 {

	public static void main(String[] args) {
		System.out.println(multi(5));
	}
	
	
	public static int multi(int n) {
		if(n == 1) {
			return 1;
		}
		return n*multi(n-1);
	}

}
