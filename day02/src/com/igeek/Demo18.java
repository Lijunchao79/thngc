package com.igeek;

public class Demo18 {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		int[][] arr2 = new int[][] {{3,6,8},{12,9},{7,0,6,4}};
		
		int sum = 0;
		for(int i=0;i<arr2.length;i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum += arr2[i][j];
			}
		}
		System.out.println(sum);

	}

}
