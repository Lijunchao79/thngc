package com.igeek;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author zx
 * @version 1.0
 * @description:HashSet:无序的，不可重复的
 */
public class Demo06 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		//添加元素
		hashSet.add("java");
		hashSet.add("c");
		hashSet.add("c++");
		hashSet.add("oc");
		hashSet.add("java");
		
		System.out.println(hashSet);
		
		//迭代器
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("************************");
		for (String elem : hashSet) {
			System.out.println(elem);
		}

	}

}
