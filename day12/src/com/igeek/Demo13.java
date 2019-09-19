package com.igeek;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zx
 * @version 1.0
 * @description:ByteArrayInputStream:字节数组流
 */
public class Demo13 {

	public static void main(String[] args) throws IOException {
		
		byte[] src = "talk is cheap,show me the code".getBytes();
		
		InputStream is = new ByteArrayInputStream(src);
		//缓冲容器
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = is.read(buffer)) != -1) {
			System.out.println(new String(buffer,0,len));
		}

	}

}
