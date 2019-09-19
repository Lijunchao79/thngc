package com.igeek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @description:字节输出流
 */
public class Demo02 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("b.txt");
			fos.write(0b00000000000000000000000001100001);
			fos.write(0b01100001);
			fos.write(97);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
