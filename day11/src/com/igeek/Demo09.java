package com.igeek;

import java.util.ArrayList;
import java.util.Collections;

public class Demo09 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("***********************************");
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("d");
		list2.add("h");
		list2.add("f");
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);

	}

}
