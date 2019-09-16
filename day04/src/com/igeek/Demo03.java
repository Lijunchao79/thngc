package com.igeek;

import java.util.ArrayList;

public class Demo03 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		arrayList.add("c");
		arrayList.add("oc");
		arrayList.add("python");
		
		for (int i = 0; i < arrayList.size(); i++) {
			String s = arrayList.get(i);
			System.out.println(s);
		}
		System.out.println("*********************************");
		for (String str : arrayList) {
			System.out.println(str);
		}
		

	}

}
