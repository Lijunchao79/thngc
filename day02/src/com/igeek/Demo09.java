package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:continue 结束本次循环，进入循环的下一次
 */
public class Demo09 {

	public static void main(String[] args) {
		for(int i= 1;i<=10;i++) {
			if(i == 10) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("hi");
	}

}
