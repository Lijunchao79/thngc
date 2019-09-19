package com.igeek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author zx
 * @version 1.0
 * @description:转换流；
 * OutputStreamWriter可以完成字节输出流转换为字符输出流
 * 
 */
public class Demo08 {
	
	public static void main(String[] args) throws IOException {
		OutputStreamWriter os = new OutputStreamWriter
				(new FileOutputStream("f.txt"));
		
		os.write("hello");
		
		os.close();
		
	}

}
