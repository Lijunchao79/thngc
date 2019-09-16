package com.igeek;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Administrator
 * 需求：往文件中写数据
 * 		写数据--输出流--FileWriter
 * 
 * FileWriter:
 * 		FileWriter(String fileName):传递一个文件名称
 * 
 * 输出流写数据的步骤：
 * 		A:创建输出流对象
 * 		B:调用输出流对象的写数据的方法
 * 
 * 根据给定的文件名构造一个 FileWriter 对象。
 * public FileWriter(String fileName)
           throws IOException
           
 * flush():刷新缓冲区。流对象还可以继续使用。
 * close():先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了
 */
public class Demo08 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\demo2\\a.txt");
		fw.write("hello World");
		fw.write("hello java");
		fw.flush();
		fw.close();
	}

}
