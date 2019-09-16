package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @version 1.0
 * @descroption:泛型<T,E,K,V>
 */
public class Demo10 {

	public static void main(String[] args) {
		Person p = new Person("Jack", 18);
		Person p2 = new Person("Rose", 16);
		ArrayList<Person> arrayList = new ArrayList<>();
//		arrayList.add("java");
//		arrayList.add(12);
		arrayList.add(p);
		arrayList.add(p2);
		
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.get(2));
		
//		for (Object object : arrayList) {
//			if(object instanceof Person) {
//				System.out.println(((Person)object).getName());
//			}
//		}
		
		for (Person person : arrayList) {
			System.out.println(person.getName());
		}

	}

}
