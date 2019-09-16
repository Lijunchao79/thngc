package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 利用StringBuilder把数组拼接成一个字符串
   举例：
		int[] arr = {1,2,3};
   结果：
		[1, 2, 3]
 */
public class Demo21 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		StringBuilder s = new StringBuilder("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				s.append(arr[i]);
			}else {
				s.append(arr[i]).append(",");
			}
		}
		s.append("]");
		System.out.println(s);
	}

}
