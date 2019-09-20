package com.igeek;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
 * @author zx
 * @version 1.0
 * @description:commons-io
 */
public class Demo01 {

	public static void main(String[] args) {
		
		//文件大小
		long size = FileUtils.sizeOf(new File("src\\com\\igeek\\Demo01.java"));
		System.out.println(size);
		
		long size2 =  FileUtils.sizeOf(new File("src"));
		System.out.println(size2);

	}
	


}
   