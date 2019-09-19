package com.igeek;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * @author zx
 * @version 1.0
 * @description:File工具类
 */
public class FileCopy {
	
	public static void main(String[] args) throws FileNotFoundException{
		//copy("test.png", "testCopy.png");
		//copyByBuffer("test.png", "testCopyB.png");
		copy(new FileInputStream("test.png"),new FileOutputStream("testB.png"));
	}

	public static void copy(String src,String dest) {
		// 1.创建源
		File file = new File(src);
		File file2 = new File(dest);
		// 2.选择流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			// 3.读写操作
			byte[] buffer = new byte[1024];
			int len = -1;
			while ((len = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4.释放资源
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void copyByBuffer(String src,String dest) {
		//1.创建源
		File srcFile = new File(src);
		File destFile = new File(dest);
		//try-with-resource
		//2.选择流
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));) {
			//3.读写操作
			byte[] buffer = new byte[1024];//缓冲区
			int len = -1;
			while((len = bis.read(buffer)) != -1) {
				bos.write(buffer,0,len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	public static void copy(InputStream is,OutputStream os) {
		try{
			byte[] buffer = new byte[1024];//缓冲区
			int len = -1;
			while((len = is.read(buffer)) != -1) {
				os.write(buffer,0,len);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os != null) {
					os.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(is != null) {
					is.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
