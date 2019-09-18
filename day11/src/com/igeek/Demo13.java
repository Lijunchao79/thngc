package com.igeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @version 1.0
 * @description: 
 * 集合转数组: 
 * 集合ArrayList转为数组的方法为ArrayList的以下两个方法： 
 * public Object[] toArray() 
 * //集合转数组 
 * public <T> T[] toArray(T[] a)
 */
public class Demo13 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		
		Object[] objects = list.toArray();
		System.out.println(Arrays.toString(objects));
		
		//调用方法,将集合转为带类型的数组
		Integer[] intArr = new Integer[list.size()];
		Integer[] returnArr = list.toArray(intArr);
		
		//如果参数数组足够放下集合中所有元素,就放入参数数组中,返回参数数组
		//如果参数数组无法放下集合中所有元素,则参数数组只起到确定类型作用,方法逻辑会自动创建新数组存储集合内容,并返回.
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(returnArr));

	}

}
