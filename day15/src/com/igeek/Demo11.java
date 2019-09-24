package com.igeek;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

/**
 * @author zx
 * @version 1.0
 * @description:beanUtils工具类
 * 
 *   BeanUtils工具常用工具类有两个：BeanUtils、ConvertUtils。
*    BeanUtils用于封装数据，ConvertUtils用于处理类型转换
*    
*    常用方法：
*    	setProperty(Object obj,String name,Object value)：
*    		设置属性值，如果指定属性不存在，不抛异常
*    
*    	getProperty(Object obj,String name)：
*    		获得属性值，如果指定属性不存在，抛方法找不到异常
 */
public class Demo11 {
	
	@Test
	public void test() {
		User user = new User();
		
		user.setUid("1001");
		user.setUserName("zs");
		user.setAge(23);
		
		System.out.println(user);
	}
	
	@Test
	public void test02() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		User user = new User();
		System.out.println(user);
		
		BeanUtils.setProperty(user, "uid", "1001");
		BeanUtils.setProperty(user, "userName", "jack");
		
		System.out.println(user);
		
		String userName = BeanUtils.getProperty(user, "userName");
		System.out.println(userName);
		
		
	}

}
