package com.igeek;

import java.lang.Thread.State;

public class Demo10 {

	public static void main(String[] args) {
//		System.out.println(Season.AUTUMN);
//		System.out.println(Season.SPRING);
//		System.out.println(Season2.AUTUMN);
		
		Season2 season2 = Season2.WINTER;
		System.out.println(season2);
		System.out.println("**********************");
		Season2[] values = Season2.values();
		for (Season2 value : values) {
			System.out.println(value);
		}
		System.out.println("**********************");
		State[] states = Thread.State.values();
		for (State state : states) {
			System.out.println(state);
		}

	}

}
