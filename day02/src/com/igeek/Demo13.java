package com.igeek;
/**
 * @author zx
 * @version 1.0
 * @description:数组
 * 格式1：数据类型[] 数组名;
 * 格式2：数据类型 数组名[];
 */
public class Demo13 {

	public static void main(String[] args) {
		int[] arr1;
		int arr2[];
		//指定数组的长度
		int[] arr3 = new int[5];
		int[] arr4 = new int[] {1,2,3};
		
		//简化
		int[] arr5 = {1,2,3,4,5};
		int[] arr6 = arr5;
		
		/*System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		System.out.println(arr5[3]);
		System.out.println(arr5[4]);*/
		//java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(arr5[5]);
		//length属性，返回数组的长度
		System.out.println(arr5.length);
		arr5[0] = 99;
		//System.out.println(arr5[0]);
		
		for (int i : arr5) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : arr6) {
			System.out.print(i+" ");
		}

	}

}
