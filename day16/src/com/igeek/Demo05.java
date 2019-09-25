package com.igeek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class Demo05 {
	
	@Test
	public void test1() {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("test.properties"));
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("className"));
		
	}
	
	@Test
	public void test2() {
		//通过类加载器加载资源
		Properties prop = new Properties();
		ClassLoader classLoader = Demo05.class.getClassLoader();
		InputStream in = classLoader.getResourceAsStream("test.properties");
		try {
			prop.load(in);
			System.out.println(prop.getProperty("className"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
