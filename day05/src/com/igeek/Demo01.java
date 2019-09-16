package com.igeek;

import java.io.File;

/**
 * @author Administrator
 * File类的使用
 * 
 * 1.File(File parent, String child)
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
   2.File(String pathname)
          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
   3.File(String parent, String child)
          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
 * 
 * 相对路径
 * 绝对路径：具体的路径，盘符开始到文件或者是文件夹
 * 
 * "/" 表示 UNIX 
 * "\\" 表示 Windows 
 * 
 * File.separator:分隔符
 * 
 */
public class Demo01 {

	public static void main(String[] args) {
		//构造方法1
		File file = new File("hello.txt");
		File file2 = new File("D:\\thngc-workspace\\day05\\hello.txt");
		System.out.println(file);
		System.out.println(file2);
		//分隔符
		File file3 = new File("d:"+File.separator+"thngc-workspace"
				+File.separator+"day05"+File.separator+"hello.txt");
		System.out.println(file3);
		//构造方法2
		File file4 = new File("D:\\thngc-workspace\\day05", "hello.txt");
		System.out.println(file4);
		//构造方法3
		File file5 = new File(new File("D:\\thngc-workspace\\day05"), "hello.txt");
		System.out.println(file5);

	}

}
