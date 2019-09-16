package com.igeek;

public class Stu {
	private String name;
	private String age;
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stu(String name, String age) {
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + "]";
	}

}
