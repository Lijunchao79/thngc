package com.igeek.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 定义静态的一个工具类，定义方法populate，参数为Class和Map<String,String[]>，返回值类型为T
 */
public class MyBeanUtils02 {
	
	public static Object populate(Class bean, Map<String,String[]> properties){
		Object object = null;
		try {
			//利用反射实例化对象
			object = bean.newInstance();
			BeanUtils.populate(object, properties);
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}

}
