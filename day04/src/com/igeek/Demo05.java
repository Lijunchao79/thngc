package com.igeek;

import java.util.ArrayList;

public class Demo05 {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<>();

		// 创建学生对象
		Student s1 = new Student("林青霞", 28);
		Student s2 = new Student("张曼玉", 30);
		Student s3 = new Student("景甜", 25);
		Student s4 = new Student("柳岩", 18);

		// 把学生对象作为元素添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		for (Student student : array) {
			System.out.println(student);
		}

	}

}
