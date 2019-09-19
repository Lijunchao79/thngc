package com.igeek;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * @author zx
 * @version 1.0
 * @description:PrintWriter
 */
public class Demo20 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(
				new BufferedOutputStream(new FileOutputStream("print2.txt")));
		pw.println("java");
		pw.print(false);
		pw.close();

	}

}
