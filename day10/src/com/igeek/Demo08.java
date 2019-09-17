package com.igeek;

import java.util.ArrayList;

public class Demo08 {

	public static void main(String[] args) {
		// 创建ArrayList对象
		ArrayList<String> list = new ArrayList<String>();

		// 在list中加入数据
		list.add("Jack");
		list.add("Rose");
		list.add("Trump");

		// 判断集合中是否存在Jack
		System.out.println(list.contains("Jack"));
		System.out.println("========================");

		// ArrayList当中存储自定义数据类型Person
		ArrayList<Person> list2 = new ArrayList<Person>();

		Person p = new Person("Jack", 18);
		Person p2 = new Person("Rose", 16);
		Person p3 = new Person("Trump", 62);

		list2.add(p);
		list2.add(p2);
		list2.add(p3);

		System.out.println(list2.contains(new Person("Jack", 18)));
		System.out.println(list2.contains(p));

	}

}
