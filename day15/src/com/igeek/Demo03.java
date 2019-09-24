package com.igeek;

import java.util.Properties;
import java.util.Set;

public class Demo03 {
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		//设置数据
		prop.setProperty("aa", "java");
		prop.setProperty("bb", "c");
		prop.setProperty("cc", "python");
		
		//获取数据
		String value = prop.getProperty("aa");
		System.out.println(value);
		
		//获取所有的names
		Set<String> keySet = prop.stringPropertyNames();
		for (String key : keySet) {
			System.out.println(key+"====>"+prop.getProperty(key));
		}
		
		
		
		
		
	}

}
