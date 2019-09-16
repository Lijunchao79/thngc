package com.igeek;

import java.util.ArrayList;
import java.util.Iterator;

//遇到16岁的人时,就添加一个90岁的人
public class Demo09 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		// 向集合中添加元素
		Person p = new Person("Jack", 18);
		Person p2 = new Person("Rose", 16);
		Person p3 = new Person("Trump", 62);
		Person p4 = new Person("Obmama",90);

		list.add(p);
		list.add(p2);
		list.add(p3);
		//拿到迭代器
		Iterator<Person> iterator = list.iterator();
		//遍历元素
		while(iterator.hasNext()) {
			Person person = iterator.next();
			if(person.getAge() == 16) {
				//java.util.ConcurrentModificationException
				list.add(p4);
				break;
			}
		}
		
		Iterator<Person> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			Person person = (Person) iterator2.next();
			System.out.println(person);
		}
		
		
		
	}

}
