package com.igeek;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @description:ByteArrayOutputStream
 * toByteArray() :获取数据
 */
public class Demo14 {

	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		byte[] bytes = "talk is cheap,show me the code".getBytes();//编码
		os.write(bytes, 0, bytes.length);
		
		byte[] temps = os.toByteArray();
		System.out.println(new String(temps,0,temps.length));

	}

}
