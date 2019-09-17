package com.igeek;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author zx
 * @version 1.0
 * @description:Collection
 * 1.boolean add(E e)
 * 2.boolean addAll(Collection<? extends E> c)
 */
public class Demo02 {

	public static void main(String[] args) {
		Collection<Object> coll = new ArrayList<Object>();
		coll.add("java");
		coll.add(123);
		coll.add(456);
		coll.add(false);
		coll.add(new String("c"));
		coll.add(new Person("jack", 20));
//		coll.add(new Student("rose"));
//		System.out.println(coll);
		
//		Collection coll2 = new ArrayList();
//		coll2.addAll(coll);
//		System.out.println(coll2);
//		
//		System.out.println(coll.size());
		
//		coll.clear();
//		System.out.println(coll.size());
//		
//		boolean flag = coll.isEmpty();
//		System.out.println(flag);
		
//		boolean flag = coll.contains("javac");
		//true
//		System.out.println(coll.contains(new String("c")));
		//false
//		System.out.println(coll.contains(new Student("rose")));
		//true(重写equals方法)
//		System.out.println(coll.contains(new Person("jack", 20)));
		
		
//		Collection coll3 = new ArrayList();
//		coll3.add(new Person("jack", 20));
//		coll3.add("java");
//		coll3.add(123);
//		coll3.add(456);
//		coll3.add(false);
//		coll3.add(new String("c"));
//		coll3.add(new Student("rose"));
//		
//		System.out.println("containsAll:"+coll.containsAll(coll3));
		
//		coll.remove("java");
//		System.out.println(coll);
		
		Collection coll4 = new ArrayList();
		coll4.add(123);
		coll4.add(456);
		coll4.add(789);
		coll4.add(false);
		coll4.add(new String("c"));
		//差集
//		coll.removeAll(coll4);
//		System.out.println(coll);
		
		//交集
//		coll.retainAll(coll4);
//		System.out.println(coll);
		
		Object[] objects = coll.toArray();
		for (Object object : objects) {
			System.out.println(object);
		}
		
		

	}

}
