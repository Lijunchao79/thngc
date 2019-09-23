package com.igeek;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zx
 * @version 1.0
 * @description:单元测试Junit
 * 1.使用@Test注解
 * 2.@After
 * 3.@Before
 * 4.打断言;一种测试机制
 */
public class Demo13 {
	
	@Test
	public void test01() {
		System.out.println("hello junit......");
	}
	
	@Test
	public void test02() {
		System.out.println("test02....");
		String str = new String();
		//打断言
		Assert.assertNotNull(str);
		Assert.assertTrue(false);
	}
	
	@Before
	public void test03() {
		System.out.println("test03....");
	}
	
	@After
	public void test04() {
		System.out.println("test04....");
	}

}
