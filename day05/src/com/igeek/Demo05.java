package com.igeek;

import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 * 文件的创建
 * 1.public boolean createNewFile():
 * 如果指定的文件不存在并成功地创建，则返回 true；如果指定的文件已经存在，则返回 false
 * 2.public boolean delete()
 * 当且仅当成功删除文件或目录时，返回 true；否则返回 false
 */
public class Demo05 {

	public static void main(String[] args) throws IOException {
		File file = new File("hello.txt");
		//System.out.println(file);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("创建成功");
		}else {//文件存在
			file.delete();
			System.out.println("删除成功");
		}
		

	}

}
