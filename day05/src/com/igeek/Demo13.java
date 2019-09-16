package com.igeek;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Administrator
 * FileReader读数据一次读取一个字符数组的数据
 *  输入流读文件的步骤：
*    	A：创建输入流对象
*    	B：调用输入流对象的读数据方法
*    	C：释放资源
 */
public class Demo13 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\thngc-workspace\\day05\\src\\com\\igeek\\DirCount.java");
		
		char[] buffer = new char[1024];
		int len;
		while ((len = fr.read(buffer)) != -1) {
			System.out.println(new String(buffer,0,len));
		}
		
		fr.close();

	}

}
