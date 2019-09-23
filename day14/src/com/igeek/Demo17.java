package com.igeek;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zx
 * @version 1.0
 * @description:Method对象
 * 1.getDeclaredMethods():拿到所有的方法，不包括继承的方法
 * 2.getDeclaredMethod()
 * 3.getMethods():拿到所有public的方法，包括继承的方法
 * 4.getMethod()
 * 
 * 5.invoke()
 */
public class Demo17 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 获取Student的Class对象
		Class student = Class.forName("com.igeek.Student");
		
		Method study = student.getMethod("study");
		Student student2 = new Student();
		study.invoke(student2);
		
		Method eat = student.getMethod("eat", String.class);
		eat.invoke(student2, "apple");
		System.out.println("********************************");
		Method[] methods = student.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("********************************");
		Method[] methods2 = student.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}

	}

}
