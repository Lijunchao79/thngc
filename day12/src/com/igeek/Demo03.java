package com.igeek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @description:
 * public FileOutputStream(String name,boolean append) append参数:是否追加数据
 */
public class Demo03 {

	public static void main(String[] args) {
		FileOutputStream fs = null;
		try {
		    fs = new FileOutputStream("e.txt",true);
		    String str = "talk is cheap,show me the code";
		    byte[] bytes = str.getBytes();
//			byte[] bytes = {97,98,99} ;
			fs.write(bytes);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//释放资源
			try {
				if(fs != null) {
					fs.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
