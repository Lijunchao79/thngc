package com.igeek;

public class Demo14 {

	public static void main(String[] args) {
		
		int[] arr5 = {1,2,3,4,5};
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		System.out.println("******************");
		for (int i : arr5) {
			System.out.println(i);
		}

	}

}
