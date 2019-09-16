package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version 1.0
 * @description: 需求： 
 * (1)键盘录入5个int类型的数据存储数组arr中 
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 */
public class Demo03 {

	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner scanner = new  Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数:");
			int number = scanner.nextInt();
			score[i] = number;
		}
		print(score);
		reverse(score);
		print(score);
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void reverse(int[] arr) {
		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			//交换
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
