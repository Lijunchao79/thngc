package com.igeek;

/**
 * 
 * @author zx
 * @version 1.0
 * @description:
 */
public class Demo27 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		change(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();

	}
	
	public static void change(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] *= 2;
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
