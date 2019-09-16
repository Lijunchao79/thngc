package com.igeek;

import java.util.ArrayList;

public class Demo06 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(12);
//		arr.add("we");
		arr.add(34);
		arr.add(56);
		
		Integer a = arr.get(0);
		System.out.println(a);
		
		int size = arr.size();
		System.out.println(size);
		
		System.out.println("******************");
		
		for (Integer integer : arr) {
			System.out.print(integer+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		
		

	}

}
