package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 举例：int[] arr = {1,2,3};	
*   输出结果：[1, 2, 3]
* 
* 分析：
* 		A:定义一个int类型的数组
* 		B:写方法实现把数组中的元素按照指定的格式拼接成一个字符串
* 		C:调用方法
* 		D:输出结果
 */
public class Demo16 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		String s = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				s += arr[i];
			}else {
				s += arr[i]+",";
			}
		}
		s+="]";
		System.out.println(s);

	}

}
