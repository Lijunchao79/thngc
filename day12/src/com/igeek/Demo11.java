package com.igeek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 操作网络流，完成读写操作
 * 写到baidu.html文件中去
 */
public class Demo11 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(
				new URL("http://www.baidu.com").openStream(),"utf8"));
				BufferedWriter bw = new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream("baidu.html")))){
			//读写操作
			String msg;
			while((msg = br.readLine()) != null) {
				bw.write(msg);
				bw.newLine();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
