package com.igeek;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

public class Demo04 {

	public static void main(String[] args) throws IOException {
		
		FileUtils.write(new File("b.txt"), "你好IO\r\n","utf-8");
		FileUtils.writeStringToFile(new File("b.txt"), "good good study day day up好好学习，天天向上\r\n","utf-8",true);
		FileUtils.writeByteArrayToFile(new File("b.txt"), "show me the code".getBytes(),true);
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("你好");
		arrayList.add("IO");
		//第三个参数：分隔符：lineEnding - the line separator to use, null is system default
		FileUtils.writeLines(new File("b.txt"), arrayList,"*******",true);
		

	}

}
