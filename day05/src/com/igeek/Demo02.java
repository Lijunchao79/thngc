package com.igeek;

import java.io.File;
import java.util.Date;

/**
 * @author Administrator
 * 绝对路径:public String getAbsolutePath()
 * 获取路径:public String getPath()
 * 文件或目录的名称:public String getName()
 * 父目录：public String getParent()，如果此路径名没有指定父目录，则返回 null
 * 文件的长度:public long length();返回字节数;如果此路径名表示一个目录，则返回值是不确定的
 * 文件最后一次被修改的时间:public long lastModified()
 * 
 * 目录中的文件和目录:public String[] list()
 * 目录中的文件public File[] listFiles()
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		File file = new File("D:\\thngc-workspace\\day05");
		System.out.println(file);
		String absolutePath = file.getAbsolutePath();
		System.out.println("绝对路径:"+absolutePath);
		String path = file.getPath();
		System.out.println("路径:"+path);
		String name = file.getName();
		System.out.println("名称:"+name);
		String parent = file.getParent();
		System.out.println("父目录:"+parent);
		System.out.println("********************");
		long length = file.length();
		System.out.println(length);
		long modified = file.lastModified();
		System.out.println(new Date(modified));
		System.out.println("********************");
		String[] fiStrings = file.list();
		for (String string : fiStrings) {
			System.out.println(string);
		}
		System.out.println("********************");
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f);
		}
	}

}
