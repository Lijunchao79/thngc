package com.igeek;

import java.lang.reflect.Field;

/**
 * @author zx
 * @version 1.0
 * @description:
 * Field对象
 * 1.getFields()
 * 2.getField()
 * 3.Field get()
 * 4.Field set()
 * 5.getDeclaredFields();
 * 6.getDeclaredField();
 * 
 * 7.setAccessible(true)
 */
public class Demo15 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//获取Student的Class对象
		Class student =  Class.forName("com.igeek.Student");
		//获取所有public修饰的成员变量
		Field[] fields = student.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("****************");
		Field a = student.getField("a");
		// 返回指定对象上此 Field 表示的字段的值
		Student jack = new Student();
		Object value = a.get(jack);
		System.out.println(value);
		//设置Field的值
		a.set(jack, "rose");
		System.out.println(jack);
		
		System.out.println("****************");
		//获取所有成员变量
		Field[] fields2 = student.getDeclaredFields();
		for (Field field : fields2) {
			System.out.println(field);
		}
		System.out.println("****************");
		Field field3 = student.getDeclaredField("id");
		System.out.println(field3);
		
		System.out.println("****************");
		Student student2 = new Student();
		//暴力反射，或略安全检查机制
		field3.setAccessible(true);
		Object value2 = field3.get(student2);
		//java.lang.IllegalAccessException:
		System.out.println(value2);
		field3.set(student2, "1001");
		System.out.println(student2);
		
		
		

	}

}
