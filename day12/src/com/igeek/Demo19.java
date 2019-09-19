package com.igeek;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author zx
 * @version 1.0
 * @description:打印流
 */
public class Demo19 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = System.out;
		ps.println("打印流");
		ps.print(false);
		
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")));
		ps.println("打印流");
		ps.print(false);
		ps.flush();

	}

}
