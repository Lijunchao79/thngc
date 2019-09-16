package com.igeek;

import java.util.Properties;

/**
 * 
 * @author zx
 * @version 1.0
 * @descroption:System 
 *  public static void exit(int status)：让操作系统终止该java程序  0代表正常终止
	public static void gc()：暗示java虚拟机回收不使用的对象(垃圾)
	public static String getProperty(String key) ：查找制定的系统属性 , 系统属性参照API
 */
public class Demo02 {

	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		
		System.out.println(System.getProperty("user.dir"));
		
		Properties properties = System.getProperties();
		System.out.println("hi");
		System.err.println("JAVA");

	}

}
