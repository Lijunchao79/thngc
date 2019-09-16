package com.igeek;

import java.util.Arrays;

public class Demo05 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] arr2 = {1,3,2,4};
		
		//System.out.println(Arrays.equals(arr, arr2));
		//Arrays.fill(arr, 10);
		//System.out.println(Arrays.toString(arr));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		int index = Arrays.binarySearch(arr, 4);
		System.out.println(index);
		
		// << >> 位运算直接对二进制进行操作  >>>
		System.out.println((3 << 3));
		System.out.println((8 >> 1));
	}

}
