package com.igeek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo10 {

	public static void main(String[] args) {
		// 验证二分法查找元素必须有序
		List<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		
//		int val = Collections.binarySearch(list, 9);
//		System.out.println(val);
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 2));
		
	}

}
