package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 模拟Junit测试，首先需要编写自定义注解@MyTest，并添加元注解，保证自定义注解只能修改方法，且在运行时可以获得。
   其次编写目标类（测试类），然后给目标方法（测试方法）使用@MyTest注解
   最后编写测试类，使用main方法模拟Junit的右键运行。
 */
public class Demo02 {
	
	@MyTest
	public void testDemo01(){
		System.out.println("demo01");
	}
	

	public void testDemo02(){
		System.out.println("demo02");
	}
	
	@MyTest
	public void testDemo03(){
		System.out.println("demo03");
	}

}
