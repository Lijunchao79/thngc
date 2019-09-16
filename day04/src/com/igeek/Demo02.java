package com.igeek;

import java.util.ArrayList;

/**
 * @author Administrator
 * 集合
 * * 构造方法：
 * 		ArrayList()
 * 
 * 添加元素：
 * 		public boolean add(E e):添加元素
 * 		public void add(int index,E element):在指定的索引处添加一个元素
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		//Appends the specified element to the end of this list.
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		arrayList.add("c");
		
		System.out.println(arrayList);
		arrayList.add(2, "c++");
		System.out.println(arrayList);
		arrayList.add(2, "python");
		System.out.println(arrayList);
		System.out.println("*************************");
		//get(int index)
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		
		//public int size()：返回元素个数
		System.out.println(arrayList.size());
		
		
		//public E remove(int index)：删除
		arrayList.remove(0);
		System.out.println(arrayList);
		arrayList.remove("c");
		//public boolean remove(Object o)：删除
		System.out.println(arrayList);
		
		//public E set(int index,E element):修改
		arrayList.set(0, "c#");
		System.out.println(arrayList);
		
		
	}

}
