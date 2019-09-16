package com.igeek;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Administrator
 * 文件复制拷贝
 * 
 * 需求:把目标文件读进来，再写到指定的文件中去
 */
public class Demo14 {

	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("D:\\thngc-workspace\\day05\\src\\com\\igeek\\DirCount.java");
		
		FileWriter fileWriter = new FileWriter("Copy2.java");
		
//		int len = -1;
//		while((len = fileReader.read()) != -1) {
//			fileWriter.write(len);
//		}
		
		//读写数据
		char[] buffer = new char[1024];
		int len;
		while((len = fileReader.read(buffer)) != -1) {
			fileWriter.write(buffer, 0, len);
		}
		//关闭资源
		fileWriter.close();
		fileReader.close();

	}

}
