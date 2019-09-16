package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:不死神兔问题
 *  * 需求：
 * 		有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 		假如兔子都不死，问第二十个月的兔子对数为多少？ 
 *  第1月:1
 *  第2月:1
 *  第3月:1(生) 1 = 2
 *  第4月:1(生) 1 1 = 3
 *  第5月:1(生) 1(生) 1 1 1 = 5
 *  第6月:1 1 1 1 1 1 1 1= 8
 *  .....
 */
public class Demo28 {

	public static void main(String[] args) {
		int[] arr = new int[20];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<arr.length;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[19]);
	}

}
