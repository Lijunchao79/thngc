package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:通过Class对象实例化对象
 * newInstance()
 */
public class Demo01 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class stu =Student.class;
		Object object = stu.newInstance();
		System.out.println(object);
		
		String str = stu.getName();
		System.out.println(str);
		String str2 = stu.getSimpleName();
		System.out.println(str2);
		
	} 

}
