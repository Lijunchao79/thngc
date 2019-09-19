package com.igeek;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @description:BufferedOutputStream
 */
public class Demo07 {

	public static void main(String[] args) {
		File file = new File("dest.txt");
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file));
			//操作
			String msg = "talk is cheap,\r\nshow me the code";
			byte[] temp = msg.getBytes();
			bos.write(temp, 0, temp.length);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
