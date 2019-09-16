package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description: 冒泡排序
 */
public class Demo16 {
	
	public static void main(String[] args) {
		
		int[] arr = { 12, 98, 45, 73, 60 };
		bubbleSort(arr);
	}
	/**
	 *1  比较相邻的元素。如果第一个比第二个大，就交换它们两个；
	 *2	对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
	 *3	针对所有的元素重复以上的步骤，除了最后一个；
	 *4	重复步骤1~3，直到排序完成。
	 */
	public static void bubbleSort(int[] arr) {
		//做几趟
		for(int i=0;i<arr.length-1;i++) {
			//内循环
			for(int j=0;j<arr.length-1-i;j++) {
				//比较相邻的元素
				if(arr[j]>arr[j+1]) {
					//交换
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	

}
