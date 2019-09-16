package com.igeek;

public class Student {
	
	//成员属性,成员变量，field
	//在类中，方法外。
	//初始化值：不需要给初始化值。
	private int id;
	private String name;
	private int age;
	private String address;
	
	//构造方法
	public Student() {
		System.out.println("无参的构造方法");
	}
	
	public Student(int id,String name) {
		System.out.println("带参的构造方法");
		this.id = id;
		this.name = name;
	}
	
	public Student(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("年龄有误");
		}else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//成员方法
	public void eat() {
		System.out.println("eat....");
	}
	
	public void sleep() {
		System.out.println("sleep.....");
	}
	
	public void study() {
		System.out.println("study.....");
	}
	
	public static void main(String[] args) {
		//拿到一个对象; 类名 对象名 = new 类名();
		Student stu = new Student();
		stu.name="zs";
		stu.age = 12;
		stu.eat();
		stu.study();
		System.out.println(stu.name);
		System.out.println(stu.address);
		
		System.out.println(stu);
	}

}
