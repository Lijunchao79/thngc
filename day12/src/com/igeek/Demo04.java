package com.igeek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @description:字节输入流
 */
public class Demo04 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("c.txt");
		
//		int a = fileInputStream.read();
//		System.out.println((char)a);
		
		byte[] buffers = new byte[15];
		
		int c = -1;
		
		while((c = fileInputStream.read(buffers)) != -1) {
			System.out.println(new String(buffers,0,c));
		}
		
		fileInputStream.close();

	}

}
