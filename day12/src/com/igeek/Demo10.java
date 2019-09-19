package com.igeek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author zx
 * @version 1.0
 * @description:结合缓冲流来使用
 */
public class Demo10 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			//遇到exit结束
			String msg = "";
			while(!msg.equals("exit")) {
				msg = br.readLine();
				bw.write(msg);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
