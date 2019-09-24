package com.igeek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author zx
 * @version 1.0
 * @description:
 *  框架：不改变代码的前提下，创建任意的对象，执行方法
 *  
 *  分析：
 *     反射
 *     配置文件（com.igeek.Student）
 *    
 *  1.需要创建的对象信息，配置在配置文件中
 *  2.在程序加载配置文件
 *  3.利用反射机制，来创建对象，执行方法
 *  
 */
public class Demo02 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		Person person = new Person();
//		Student student = new Student();
		
		//1.加载配置文件
		Properties prop = new Properties();
		Reader reader = new InputStreamReader(new FileInputStream("test.properties"));
		
//		ClassLoader classLoader = Demo02.class.getClassLoader();
//		InputStream inputStream = classLoader.getResourceAsStream("D:\\testtt-workspace\\day15\\test.properties");
		prop.load(reader);
		
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		
		System.out.println(className+";"+methodName);
		
		//反射机制
		//1.加载进内存
		Class cls = Class.forName(className);
		System.out.println(cls.getName());
		//2.实例化对象
		Object object = cls.newInstance();
		//3.拿到Method对象
		Method method = cls.getMethod(methodName);
		//4.调用方法
		method.invoke(object);
		
		
		

	}

}
