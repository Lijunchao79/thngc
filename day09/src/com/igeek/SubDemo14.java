package com.igeek;

public class SubDemo14<T> implements Demo13<T>{

	@Override
	public void method(T t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		SubDemo14<Integer> demo14 = new SubDemo14<>();
		demo14.method(12);
//		demo14.method("java");
	}

}
