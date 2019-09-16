package com.igeek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zx
 * BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
 * 装饰模式
 */
public class Demo15 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new FileReader("D:\\thngc-workspace\\day05\\src\\com\\igeek\\DirCount.java"));
		
		//一次读写一个字符
//		int ch;
//		while((ch=br.read())!=-1){
//			System.out.print((char)ch);
//		}
		
		//一次读写一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		
		}
		//释放资源
		br.close();
		
	}

}
