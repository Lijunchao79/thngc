package com.igeek;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo08 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		// 向集合中添加元素
		Person p = new Person("Jack", 18);
		Person p2 = new Person("Rose", 16);
		Person p3 = new Person("Trump", 62);

		list.add(p);
		list.add(p2);
		list.add(p3);
		//拿到迭代器
		Iterator<Person> iterator = list.iterator();
		int sumAge = 0;
		//遍历元素
		while(iterator.hasNext()) {
			Person person = iterator.next();
			sumAge += person.getAge();
		}
		System.out.println(sumAge);

	}

}
