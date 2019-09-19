package com.igeek;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author zx
 * @version 1.0
 * @description:
 */
public class Demo12 {

	public static void main(String[] args) throws IOException {
		// 使用UTF-8的方式将字符输出到文件中,文件使用GBK观看会乱码,使用UTF-8观看时正常的
//		FileOutputStream fos = new FileOutputStream("test.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
//		osw.write("你好");
//		osw.close();

		// 如果用UTF-8的方式写出两个汉字(6个字节),在那个写出的文件中观看时乱码了.这时再使用UTF-8的方式从那个文件中读回,还会乱码么?
		FileInputStream fis = new FileInputStream("test.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		System.out.println((char) isr.read());
		System.out.println((char) isr.read());
		isr.close();

	}

}
