package com.igeek;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

/**
 * @author zx
 * @version 1.0
 * @description:读取文件
 */
public class Demo03 {

	public static void main(String[] args) throws IOException {
		String str = FileUtils.readFileToString(new File("a.txt"),"utf-8");
		System.out.println(str);
		byte[] bytes = FileUtils.readFileToByteArray(new File("a.txt"));
		System.out.println(bytes.length);
		System.out.println(new String(bytes));
		//逐行读取
		List<String> list = FileUtils.readLines(new File("src\\com\\igeek\\Demo02.java"),"utf-8");
		for (String s : list) {
			System.out.println(s);
		}
		
		LineIterator lineIterator = FileUtils.lineIterator(new File("src\\com\\igeek\\Demo02.java"));
		while(lineIterator.hasNext()) {
			System.out.println(lineIterator.next());
		}
		
		
		
		
	}

}
