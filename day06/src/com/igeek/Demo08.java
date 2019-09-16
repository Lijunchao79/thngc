package com.igeek;

public class Demo08 {

	public static void main(String[] args) {
		
		Demo08 demo08 =  new Demo08();
		demo08.add(1,2);
	}
	
	//可变参数
	public void add(int...number) {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		System.out.println(sum);
	}
	

}
