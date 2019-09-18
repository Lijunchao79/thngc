package com.igeek;

import java.util.ArrayList;
import java.util.Collections;

//public static void shuffle(List<?> list)
public class Demo08 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(45);
		arrayList.add(99);
		arrayList.add(15);
		arrayList.add(43);
		System.out.println(arrayList);
		
		Collections.shuffle(arrayList);
		
		System.out.println(arrayList);

	}

}
