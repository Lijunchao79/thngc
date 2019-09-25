package com.igeek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo07 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abc");
		String s = list.get(0);
		System.out.println(s);
		System.out.println("*********************************");
		List<String> list2 = MyCollections.unmodifiableList(list);
		
		String s1 = list2.get(0);
		System.out.println(s1);
		// java.lang.UnsupportedOperationException: add操作不支持!!!
//		list2.add("def");
		
		System.out.println("*********************************");
		
		//Collections工具类的unmodifiableList()
		List<String> list3 = Collections.unmodifiableList(list);
		
		String s2 = list3.get(0);
		System.out.println(s2);
		list3.add("678");//不支持修改
		

	}

}
