package com.igeek;

import org.junit.Test;

/**
 * @author zx
 * @version 1.0
 * @description:反射获取包;获取接口
 */
public class Demo06 {
	
	@Test
	public void test1() {
		Class cls = User.class;
		Package pack = cls.getPackage();
		System.out.println(pack);
	}
	
	@Test
	public void test2() {
		Class cls = User.class;
		Class[] interfaces = cls.getInterfaces();
		for (Class inter : interfaces) {
			System.out.println(inter);
		}
		//获取父类实现的接口
		Class[] interfaces2 = cls.getSuperclass().getInterfaces();
		for (Class inter : interfaces2) {
			System.out.println(inter);
		}
		
	}

}
