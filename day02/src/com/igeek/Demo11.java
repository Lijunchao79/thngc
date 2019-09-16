package com.igeek;

import java.util.Random;

/**
 * 
 * @author zx
 * @version 1.0
 * @description:随机数
 * 在 0（包括）和指定值（不包括）之间均匀分布的 int 值。 [0,100)
 * 
 */
public class Demo11 {
	
	
	public static void main(String[] args) {
		Random random = new Random();
		//1~100的随机数
		int i = random.nextInt(10)+1;
		System.out.println(i);
	}

}
