package com.igeek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Administrator
 * 文件复制拷贝
 * 
 * 需求:把目标文件读进来，再写到指定的文件中去
 */
public class Demo17 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader fileReader = new BufferedReader(
				new FileReader("D:\\thngc-workspace\\day05\\src\\com\\igeek\\DirCount.java"));
		
		BufferedWriter fileWriter = new BufferedWriter(new FileWriter("Copy3.java"));
		
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
