package com.igeek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @description:文件复制
 * FileInputStream;
 * FileOutputStream
 * A：分析:
	最终两个文件中的数据一致
	1.利用字节输入流关联ASCII码表完整版.doc文件
	2.利用字节输出流关联ASCII码表完整版(副本).doc文件
	3.循环从ASCII码表完整版.doc读一个字节,然后将这个字节写入到ASCII码表完整版(副本).doc,
	直到读到ASCII码表完整版.doc的末尾
 */
public class Demo05 {

	public static void main(String[] args) {
		//1.创建源
		File file = new File("d.txt");
		File file2 = new File("copy.txt");
		//2.选择流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			//3.读写操作
			byte[] buffer = new byte[1024];
			int len = -1;
			while((len = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4.释放资源
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
