package com.igeek;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zx
 * FileReader
 *  需求：从文件中读数据并显示到控制台
 * 		读数据--输入流--FileReader
 * 
 * FileReader:
 * 		FileReader(String fileName):传递文件名称
 * 
 * 输入流读文件的步骤：
 * 		A:创建输入流对象
 * 		B:调用输入流对象的读数据方法
 * 		C:释放资源
 * 
 * java.io.FileNotFoundException: fr.txt (系统找不到指定的文件。)
 */
public class Demo12 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\thngc-workspace\\day05\\src\\com\\igeek\\DirCount.java");
		//The character read, or -1 if the end of the stream has been reached
//		int ch = fr.read();
//		System.out.println((char)ch);
//		int ch2 = fr.read();
//		System.out.println((char)ch2);
//		int ch3 = fr.read();
//		System.out.println((char)ch3);
//		int ch4 = fr.read();
//		System.out.println((char)ch4);
//		int ch5 = fr.read();
//		System.out.println(ch5);
		int ch = -1;
		while ((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		
		//释放资源
		fr.close();
	}

}
