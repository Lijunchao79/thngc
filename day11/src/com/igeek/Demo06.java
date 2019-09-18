package com.igeek;

import java.util.LinkedHashMap;
import java.util.Set;

public class Demo06 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(3, "java");
		map.put(8, "c");
		map.put(19, "android");
		map.put(25, "ios");
		map.put(124, "swift");
		
		System.out.println(map);
		
		//遍历
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key+"===>"+map.get(key));
		}

	}

}
