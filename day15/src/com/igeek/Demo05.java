package com.igeek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

public class Demo05 {

	public static void main(String[] args) throws IOException {
		
		
		Reader reader = new InputStreamReader(new FileInputStream("test.properties"));
		
		Properties prop = new Properties();
		
		//Properties加载数据
		prop.load(reader);
		
		Set<String> names = prop.stringPropertyNames();
		for (String name : names) {
			System.out.println(name+"====>"+prop.getProperty(name));
		}
		

	}

}
