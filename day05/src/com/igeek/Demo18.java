package com.igeek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Administrator
 * BufferedWriter
 * 		void newLine():写一个换行符，这个换行符由系统决定
 */
public class Demo18 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("f.txt"));
		
		for (int i = 0; i < 10; i++) {
			bw.write("hello"+i);
//			bw.write("\r\n");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}

}
