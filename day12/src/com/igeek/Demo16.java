package com.igeek;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

/**
 * @author zx
 * @version 1.0
 * @description:DataOutputStream
 */
public class Demo16 {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		
		//写数据
		dos.writeInt(18);
		dos.writeBoolean(false);
		dos.writeChar('a');
		dos.writeUTF("java");
		dos.flush();
		byte[] datas = bos.toByteArray();
//		System.out.println(datas.length);
		//读取数据(写入数据的顺序一致)
		DataInputStream bis = new DataInputStream(new ByteArrayInputStream(datas));
		int i = bis.readInt();
		boolean flag = bis.readBoolean();
		char ch = bis.readChar();
		String str = bis.readUTF();
		System.out.println(i);
		System.out.println(flag);
		System.out.println(ch);
		System.out.println(str);

	}

}
