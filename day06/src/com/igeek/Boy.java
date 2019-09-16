package com.igeek;

public class Boy {
	private String name;
	private int age;
	
	public Boy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Boy(String name) {
		super();
		this.name = name;
	}

	public Boy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void say() {
		if(this.age > 22) {
			System.out.println("我可以去结婚了");
		}else {
			System.out.println("谈恋爱");
		}
	}
	
	public void marry(Girl girl) {
		System.out.println("boy marry girl "+girl.getName());
	}
	
	

}
