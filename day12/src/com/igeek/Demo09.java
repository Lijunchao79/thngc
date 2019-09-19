package com.igeek;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zx
 * @version 1.0
 * @description:
 * InputStreamReader可以完成字节输入流转换为字符输入流
 */
public class Demo09 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		InputStreamReader sReader = new InputStreamReader(fis);
//		int c=-1;
//		while((c=sReader.read())!=-1) {
//			System.out.print((char)c);
//		}
		char[] chs = new char[1024];
		int len = -1;
		while((len = sReader.read(chs)) != -1) {
			System.out.print(new String(chs,0,len));
		}
		sReader.close();
	}

}
