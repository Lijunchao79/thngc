package com.igeek;

public class Demo05 {

	public static void main(String[] args) {
		
		NestedClass.InnerClass innerClass = 
				new NestedClass().new InnerClass();
		innerClass.method();

	}

}
