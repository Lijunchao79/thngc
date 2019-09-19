package com.igeek;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("a.txt");
		fw.write("hello");
		fw.write("java");
		
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("a.txt");
		int ch = fr.read();
		System.out.println((char)ch);
		
		fr.close();
	}

}
