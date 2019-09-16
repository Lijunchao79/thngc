package com.igeek;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 
 * iterator()
 * hasNext();
 * next()
 */
public class Demo07 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(12);
		arr.add(34);
		arr.add(56);
		
		//迭代器
//		Iterator<Integer> iterator = arr.iterator();
//		
//		//遍历集合的元素
//		while(iterator.hasNext()) {
//			Integer element = iterator.next();
//			System.out.println(element);
//		}
		
		for (Iterator<Integer> iterator = arr.iterator();iterator.hasNext();) {
			Integer element = iterator.next();
			System.out.println(element);
		}
		

	}

}
