package com.igeek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo16 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("e.txt"));
		bw.write("hello");
		bw.flush();
		bw.close();
	}

}
