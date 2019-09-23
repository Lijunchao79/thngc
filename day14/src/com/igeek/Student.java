package com.igeek;

public class Student {
	
	private String id;
	private String name;
	
	public String a = "jack";
	protected String b;
	String c;
	private String d;
	
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void study() {
		System.out.println("studying.....");
	}
	
	public void eat(String food) {
		System.out.println("eat "+food);
	}
	
	public void eat() {
		System.out.println("eat....");
	}
	
	private void sleep() {
		System.out.println("sleep....");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
}
