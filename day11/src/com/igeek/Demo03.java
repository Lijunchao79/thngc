package com.igeek;

import java.util.HashMap;

public class Demo03 {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "java");
		hashMap.put(2, "c");
		hashMap.put(2, "c");
		hashMap.put(2, "c++");
		System.out.println(hashMap);
		
		
//		HashMap<Integer, Stu> hashMap2 = new HashMap<>();
//		hashMap2.put(1, new Stu("jack", 20));
//		hashMap2.put(2, new Stu("rose", 22));
//		
//		Set<Integer> keySet = hashMap2.keySet();
//		for (Integer key : keySet) {
//			Stu stu = hashMap2.get(key);
//			System.out.println(stu);
//		}
//		
//		HashMap<Stu, Integer> hashMap3 = new HashMap<>();
//		hashMap3.put(new Stu("jack", 20), 1);
//		hashMap3.put(new Stu("rose", 22), 2);

	}

}
