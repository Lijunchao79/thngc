package com.igeek;

import java.io.File;

/**
 * @author Administrator
 * File的判断功能
 * 1.public boolean exists()：文件或目录是否存在
 * 2.public boolean isFile():否是一个标准文件
 * 3.public boolean isDirectory():File是否是一个目录
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		File file = new File("des.jpg");
		boolean flag1 = file.exists();
		System.out.println(flag1);
		boolean flag2 = file.isFile();
		System.out.println(flag2);
		boolean flag3 = file.isDirectory();
		System.out.println(flag3);
		System.out.println(flag3);
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		System.out.println("********************************");
		file = new File("D:\\thngc-workspace\\day05");
		flag1 = file.exists();
		System.out.println(flag1);
		flag2 = file.isFile();
		System.out.println(flag2);
		flag3 = file.isDirectory();
		System.out.println(flag3);
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		System.out.println("********************************");
		File[] files = File.listRoots();
		for (File file2 : files) {
			System.out.println(file2);
		}

	}

}
