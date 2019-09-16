package com.igeek;

import java.io.UnsupportedEncodingException;

public class Demo09 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String msg = "你好你好你好a";
		byte[] bs = msg.getBytes();
		System.out.println(bs.length);
		
		byte[] bs2 = msg.getBytes("UTF-8");
		System.out.println(bs2.length);
		
		//编码集不一致
		msg = new String(bs);
		System.out.println(msg);
		msg = new String(bs, "UTF-8");
		System.out.println(msg);
		//字节数不够
		msg = new String(bs,0,msg.length()-1);
		System.out.println(msg);

	}

}
