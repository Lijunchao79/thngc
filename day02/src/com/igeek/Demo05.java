package com.igeek;

/**
 * @author Administrator
 * for 
 * while
 * do...while
 * 
 * foreach:增强for循环;JDK1.5
 */
public class Demo05 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("*******************");
		
		sum = 0;
		int j = 1;
		while (j<=100) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		
		System.out.println("*******************");
		sum = 0;
		int k = 1;
		do {
			sum += k;
			k++;
		} while (k<=100);
		System.out.println(sum);
		
		System.out.println("*******************");
		//foreach循环·
		int[] arr = {1,2,3,4,5,6};
		for (int a : arr) {
			System.out.println(a);
		}
		
	}

}