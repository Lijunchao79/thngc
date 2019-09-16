package com.igeek;

/**
 * break:跳出循环
 */
public class Demo08 {

	public static void main(String[] args) {
		for(int i= 1;i<=10;i++) {
			if(i == 1) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("hi");

	}

}
