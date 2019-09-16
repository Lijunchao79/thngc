package com.igeek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
public class Demo20 {

	public static void main(String[] args) {
		//try-with-resources jdk1.7
		try (BufferedReader fileReader = new BufferedReader(
				new FileReader("D:\\thngc-workspace\\day05\\src\\com\\igeek\\DirCount.java"));
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter("Copy6.java"));){
			//读写数据
			String len;
			while((len = fileReader.readLine()) != null) {
				fileWriter.write(len);
				fileWriter.newLine();
				fileWriter.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
