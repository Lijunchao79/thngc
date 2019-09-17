package com.igeek;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zx
 * @version 1.0
 * @description:LinkedList
 */
public class Demo03 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		//添加
		linkedList.add("jack");
		linkedList.add("rose");
		//获取
		String str1 = linkedList.get(0);
		System.out.println(str1);
		String str2 = linkedList.get(1);
		System.out.println(str2);
		System.out.println("*****************");
		//迭代器
		Iterator<String> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*****************");
		for (Iterator<String> iterator2 = linkedList.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
		System.out.println("*****************");
		for (String string : linkedList) {
			System.out.println(string);
		}
		System.out.println("*****************");
		System.out.println("元素个数:"+linkedList.size());
		System.out.println("*****************");
		for(int i=0;i<linkedList.size();i++) {
			System.out.println(linkedList.get(i));
		}
		//添加首尾
		linkedList.addFirst("java");
		linkedList.addLast("c++");
		System.out.println(linkedList);
		//获取首尾
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		

	}

}
