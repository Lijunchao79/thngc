package com.igeek;

import java.io.File;

/**
 * @author zx
 * @version 1.0
 * @description:
 *  ./:当前目录
 */
public class Demo15 {

	public static void main(String[] args) {
		System.out.println(File.separator);

		// 创建文件对象
		File dir = new File("./");

		// 获取该文件夹下所有文件对象
		File[] filesDirs = dir.listFiles();

		for (File fileDir : filesDirs) {
			System.out.println(fileDir);
		}

	}

}
