package com.igeek;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Administrator
 * BufferedReader
 * 		String readLine():一次读取一行数据，但是不读取换行符
 */
public class Demo19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("D:\\thngc-workspace\\day05\\src\\com\\igeek\\DirCount.java"));
		
//		String line = br.readLine();
//		System.out.println(line);
//		line = br.readLine();
//		System.out.println(line);
//		line = br.readLine();
//		System.out.println(line);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
	}

}
