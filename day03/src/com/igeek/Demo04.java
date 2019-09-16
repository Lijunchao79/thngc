package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 需求：键盘录入数据,要求数据是四位的整数,现需要对数据进行加密,加密规则如下:
 * 每位数字都加上5,然后除以10的余数代替该数字,
 * 再将第一位和第四位交换,第二位和第三位交换,
 * 请把加密后的数据输出到控制台
 */
public class Demo04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入是四位的整数:");
		int num = scanner.nextInt();
		
		int[] arr = new int[4];
		int ge = num%10;
		int shi = num/10%10;
		int bai = num/10/10%10;
		int qian  = num/10/10/10%10;
		
		arr[0] = ge;
		arr[1] = shi;
		arr[2] = bai;
		arr[3] = qian;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 5;
			arr[i] %= 10;
		}
		
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		
		int temp2 = arr[1];
		arr[1] = arr[2];
		arr[2] = temp2;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
