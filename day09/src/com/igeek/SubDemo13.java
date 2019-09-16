package com.igeek;

public class SubDemo13 implements Demo13<String>{

	@Override
	public void method(String t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		SubDemo13 demo13 = new SubDemo13();
		demo13.method("java");
//		demo13.method(123);
	}

}
