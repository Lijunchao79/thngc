package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 可以直接使用非私有的父类成员;
 * java单继承和多层继承；不允许多重继承
 */
public class TestExtends {

	public static void main(String[] args) {
		
		Student xm = new Student(1,"小明",12);
		System.out.println(xm.getId());
		System.out.println(xm.getName());
		//The field Person.name is not visible
		//System.out.println(xm.name);
		//The method eat() from the type Person is not visible
		xm.eat();

	}

}
