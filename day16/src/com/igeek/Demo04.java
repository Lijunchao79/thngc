package com.igeek;

import org.junit.Test;

/**
 * 所有的类加载器，都是 java.lang.ClassLoader 的子类
 * @author zx
 * @version 1.0
 * @description:类加载器ClassLoader
 */
public class Demo04 {
	
	@Test
	public void test1() {
		
		ClassLoader cls = Demo04.class.getClassLoader();
		System.out.println(cls);
		
		ClassLoader cls2 = cls.getParent();
		System.out.println(cls2);
		
		ClassLoader cls3 = cls.getParent();
		System.out.println(cls3);
		
		System.out.println("*******************");
		
		ClassLoader classLoader = String.class.getClassLoader();
		System.out.println(classLoader);
		
	}

}
