package com.igeek;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Administrator
 * FileWriter写入换行以及向文本末尾追加
 * \n可以实现换行，但是windows系统自带的记事本打开并没有换行，这是为什么呢?
 * 		因为windows识别的换行不是\n，而是\r\n
 * 		windows:\r\n
 * 		linux:\n
 * 		mac:\r
 */
public class Demo11 {

	public static void main(String[] args) throws IOException {
		/*
		public FileWriter(File file,boolean append)
			append: boolean if true, then data will be written to 
			the end of the file rather than the beginning
		*/
		FileWriter fw = new FileWriter("c.txt",true);
		for (int i = 0; i < 10; i++) {
			fw.write("hello"+i);
			fw.write("\r\n");
		}
		fw.close();
	}

}
