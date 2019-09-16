package com.igeek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Administrator
 * void write(String str):写一个字符串数据
 * void write(String str,int index,int len):写一个字符串中的一部分数据
 * void write(int ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
 * void write(char[] chs):写一个字符数组数据
 * void write(char[] chs,int index,int len):写一个字符数组的一部分数据
 */
public class Demo10 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\demo2\\b.txt");
		fw.write("hello", 0, 3);
		fw.write(97);
		fw.write('A');
		char[] chs = {'h','i','j','a','v','a'};
		fw.write(chs);
		fw.flush();
		fw.close();
	}

}
