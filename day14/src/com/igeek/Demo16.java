package com.igeek;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zx
 * @version 1.0
 * @description:Constructor对象
 * 1.getConstructor()
 * 2.getDeclaredConstructor()
 * 
 * 3.newInstance()
 */
public class Demo16 {

	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// 获取Student的Class对象
		Class student = Class.forName("com.igeek.Student");
		Constructor[] constructors = student.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("****************");
		Constructor c1 = student.getConstructor(String.class,String.class);
		Constructor c2 = student.getConstructor();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("****************");
		//创建对象
		Object object = c2.newInstance();
		System.out.println(object);
		

	}

}
