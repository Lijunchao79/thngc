package com.igeek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Properties;

import javafx.beans.value.WritableBooleanValue;

public class Demo04 {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();

		// 设置数据
		prop.setProperty("aa", "java");
		prop.setProperty("bb", "c");
		prop.setProperty("cc", "python");
		
		Writer writer = new OutputStreamWriter(new FileOutputStream("test.properties"),"utf-8");
		
		//写入
		prop.store(writer, "测试");
		
		writer.close();
	}

}
