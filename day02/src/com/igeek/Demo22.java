package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 */
public class Demo22 {

	public static void main(String[] args) {
		int[] arr = {-2,10,45,68,103};
		//Demo22 demo22 = new Demo22();
		//The static method binarySearch(int[], int) from the type Demo22 
		//should be accessed in a static way
		Demo22.binarySearch(arr, 103);
	}
	
	public static void binarySearch(int[] arr,int key){
		int left = 0;
		int right = arr.length-1;
		boolean isFlag = false;
		
		while(left<=right) {
			int middle = (left+right)/2;
			if(arr[middle] == key) {
				System.out.println("找到了");
				isFlag = true;
				break;
			}else if(arr[middle] > key) {
				right = middle-1;
			}else {
				left = middle+1;
			}
		}
		if(!isFlag) {
			System.out.println("没找到");
		}
	}

}
