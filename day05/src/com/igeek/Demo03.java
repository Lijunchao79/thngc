package com.igeek;

import java.io.File;

/**
 * public boolean renameTo(File dest)
 * 要想返回true,保证file1在硬盘中存在；file2在硬盘中不存在
 */
public class Demo03 {

	public static void main(String[] args) {
		File file1 = new File("des.jpg");
		File file2 = new File("D:\\thngc-workspace\\day05\\test.jpg");
		
		boolean flag = file1.renameTo(file2);
		System.out.println(flag);

	}

}
