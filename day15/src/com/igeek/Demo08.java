package com.igeek;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@SuppressWarnings("all")
public class Demo08 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class.forName()
		Class cls = Class.forName("com.igeek.Student");
		
		//获得类的注解
		Annotation[] annotations = cls.getAnnotations();
//		for (Annotation annotation : annotations) {
//			System.out.println(annotation);
//		}
		
		//获得类指定的注解
		MyTable myTable = (MyTable) cls.getAnnotation(MyTable.class);
		System.out.println(myTable.value());
		
		//获得字段的注解
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
//			System.out.println(field);
			MyField myField = field.getAnnotation(MyField.class);
			System.out.println(myField);
			System.out.println(myField.columnName()+"==>"+myField.type()
			+"===>"+myField.length()+"==>"+myField.value());
		}
		

	}

}
