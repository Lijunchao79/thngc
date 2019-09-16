package com.igeek;

public class Demo25 {

	public static void main(String[] args) {
		// 调用
		System.out.println(compare(10, 20));
		System.out.println("-------------");
		System.out.println(compare((byte) 10, (byte) 20));
		System.out.println("-------------");
		System.out.println(compare((short) 10, (short) 20));
		System.out.println("-------------");
		System.out.println(compare(10L, 20L));

	}

	public static boolean compare(byte a, byte b) {
		System.out.println("byte");
		return a == b;
	}

	public static boolean compare(short a, short b) {
		System.out.println("short");
		return a == b;
	}

	public static boolean compare(long a, long b) {
		System.out.println("long");
		return a == b;
	}

}
