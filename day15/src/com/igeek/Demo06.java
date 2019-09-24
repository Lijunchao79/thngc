package com.igeek;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import org.junit.Test;

/**
 * @author zx
 * @version 1.0
 * @description:
 */
public class Demo06 {

	@Test
	public void test01() throws NoSuchMethodException, SecurityException, FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// 1、从className.properties获取类名
		Properties prop = new Properties();
		prop.load(new FileReader("className.properties"));
		String className = prop.getProperty("classname");
		System.out.println("className:" + className);
		
		// 2、创建该类的Class实例
		Class clazz = Class.forName(className);
		// 3、找到该类的构造器
		Constructor ctor = clazz.getConstructor(int.class, String.class);
		// 4、利用构造器填入数据
		Object obj = ctor.newInstance(20, "tom");
		System.out.println(obj);
		

	}
	
	@Test
	public void test02() throws Exception{
		//1.加载配置文件
		Properties prop=new Properties();
		prop.load(new FileReader("className.properties"));
		String className=prop.getProperty("classname");
		System.out.println("className:"+className);
		//2.加载进内存，拿到Class对象
		Class clazz=Class.forName(className);
		//3.Constructor对象
		Constructor ctor=clazz.getConstructor(int.class,String.class);
		//4.1从配置文件data.properties获取数据
		Properties prop_Data=new Properties();
		prop_Data.load(new FileReader("data.properties"));
		String v_id=prop_Data.getProperty("id");
		String v_name=prop_Data.getProperty("name");
		//5.实例化
		Object obj=ctor.newInstance(Integer.parseInt(v_id),v_name);
		System.out.println(obj);
	}	

}
