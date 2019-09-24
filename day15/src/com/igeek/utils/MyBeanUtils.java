package com.igeek.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

//封装
public class MyBeanUtils {
	
	public static void populate(Object bean, Map<String,String[]> properties){
		
		try {
			BeanUtils.populate(bean, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
