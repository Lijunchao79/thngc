package com.igeek;

public class PhoneDemo {

	public static void main(String[] args) {
//		Phone p = new Phone();
		//The field Phone.brand is not visible
//		System.out.println(p.price+";"+p.color);
		//两个引用指向同一个对象
//		Phone p2 = p;
		
//		Student zs = new Student();
//		zs.setAge(-12);
//		zs.age = -12;
//		System.out.println(zs.age);
//		System.out.println(zs.getAge());
//		
//		Animal animal = new Animal();
//		animal.setName("狗");
//		System.out.println(animal.getName());
		Student stu = new Student();
		Student student = new Student(1, "zs");
		System.out.println(student.getName());

	}

}
