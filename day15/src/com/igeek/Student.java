package com.igeek;

@MyTable(value="T_Student")
public class Student {
	
	@MyField(columnName="t_name",type="varchar",length=10,value="jack")
	private String name;
	
	@MyField(columnName="t_age",type="decimal",length=3,value="10")
	private String age;
	
	public Student() {
		super();
	}
	public Student(String name, String age) {
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
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public void study() {
		System.out.println("learning........");
	}
	
}
