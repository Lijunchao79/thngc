package com.igeek;

import java.io.File;

/**
 * @author Administrator
 * 创建目录:public boolean mkdir()
 * 父目录可以不存在public boolean mkdirs()
 */
public class Demo06 {

	public static void main(String[] args) {
		File file =  new File("D:/io/io1/io2/io3");
		
		boolean flag = file.mkdir();
		System.out.println(flag);
		if(flag) {
			System.out.println("创建成功1");
		}
		
		File file2 =  new File("D:/io/io1/io2/io3");
		boolean flag2 = file2.mkdirs();
		System.out.println(flag2);
		if(flag2) {
			System.out.println("创建成功2");
		}

	}

}
