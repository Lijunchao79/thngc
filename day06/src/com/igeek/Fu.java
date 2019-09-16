package com.igeek;

public class Fu {
	
	private String name;
	
	public Fu() {
		System.out.println("父类的空参构造方法被调用了");
	}
	
	public Fu(String name) {
		this.name = name;
		System.out.println("父类的带参构造方法被调用了");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
