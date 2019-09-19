package com.igeek;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @description:读取图片
 * 1.把图片读取到字节数组
 * 2.字节数组写到文件中去
 */
public class Demo15 {

	public static void main(String[] args) {
		byte[] datas = fileToByteArray("test.png");
		System.out.println(datas.length);
		byteArrayToFile(datas, "testFile.png");
	}
	
	/**
	 * 把图片读取到字节数组
	 * @param pathName
	 */
	public static byte[] fileToByteArray(String pathName) {
		byte[] datas = null;
		//1.创建源
		File file = new File(pathName);
		//2.选择流
		try(FileInputStream fis = new FileInputStream(file);
				ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
			//3.读写操作
			byte[] buffer = new byte[1024];
			int len = -1;
			while((len = fis.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			}
			bos.flush();
			//获取数据
			datas = bos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return datas;
	}
	
	/**
	 * 字节数组写到文件中去
	 */
	public static void byteArrayToFile(byte[] src,String destPath) {
		File file = new File(destPath);
		try (ByteArrayInputStream bis = new ByteArrayInputStream(src);
				FileOutputStream fos = new FileOutputStream(file);){
			//读写数据
			byte[] buffer = new byte[1024];
			int len = -1;
			while((len = bis.read(buffer))!= -1) {
				fos.write(buffer,0,len);
			}
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
