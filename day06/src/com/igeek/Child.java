package com.igeek;

public class Child extends Man{
	
	private int age;

	public Child(int age) {
		super();
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	private void printAge() {
		System.out.println("I am "+ age +" years old" );
	}

}
