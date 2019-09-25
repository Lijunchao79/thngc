package com.igeek;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo03 {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		Class cls = Demo02.class;
		Object obj = cls.newInstance();
		
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			//判断方法上有没有指定的注解;isAnnotationPresent()
			boolean flag = method.isAnnotationPresent(MyTest.class);
			if(flag) {
				method.invoke(obj);
			}
			
		}

	}

}
