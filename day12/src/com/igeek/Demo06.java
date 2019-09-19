package com.igeek;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 高效原理：缓冲区临时存储多个数据，一次调用底层资源，减少调用底层资源的次数，提高了程序运行的速度
*    
*    高效字节缓冲流：
*    	BufferedInputStream/BufferedOutputStream
*    
*    高效流的方法与普通流完全一致
*    高效流使用普通流对象作为构造方法参数。在普通流的基础上增加了缓冲区。
*    
*    高效流write写出数据时，写出位置为缓冲区，并非目标资源。
*    需要通过flush刷新方法将缓冲区的内容写出到目标文件中。
*    
*    public void flush()	刷新缓冲区，将内容写到目标文件中
*    public void close()	会调用flush方法
*    
*    
 */
public class Demo06 {

	public static void main(String[] args) {
		File file = new File("e.txt");
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			//操作
			byte[] buffer = new byte[1024];//缓冲区
			int len = -1;
			while((len = bis.read(buffer)) != -1) {
				String str = new String(buffer,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
