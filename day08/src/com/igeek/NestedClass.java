package com.igeek;

public class NestedClass {
	
	private String name = "Jack";
	
	//内部类
	public class InnerClass {
		
		public void method() {
			System.out.println("InnerClass被访问了");
			System.out.println("外部类的成员变量name的值为:"+name);
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
