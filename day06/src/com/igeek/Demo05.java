package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:instanceof二元运算符
 */
public class Demo05 {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "zs", 20);
		
		Student s2 = new Student(2, "ls", 22);
		
		System.out.println(s1 instanceof Student);
		System.out.println(s1 instanceof Person);
		System.out.println(s1 instanceof Object);
		System.out.println(new Person() instanceof Student);

	}

}
