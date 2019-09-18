package com.igeek;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author zx
 * @version 1.0
 * @description:HashMap遍历
 */
public class Demo05 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(3, "java");
		map.put(8, "c");
		map.put(19, "android");
		map.put(25, "ios");
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		//迭代器
		Iterator<Entry<Integer, String>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey()+"=====>"+entry.getValue());
		}
		//foreach
		System.out.println("***************");
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey()+"=====>"+entry.getValue());
		}
		
		System.out.println("***************");
		Collection<String> values = map.values(); 
		for (String value : values) {
			System.out.println(value);
		}
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map);
		

	}

}
