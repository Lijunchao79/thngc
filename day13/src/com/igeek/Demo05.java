package com.igeek;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class Demo05 {

	public static void main(String[] args) throws IOException {
		FileUtils.copyFile(new File("b.txt"), new File("CopyB.txt"));
		FileUtils.copyFileToDirectory(new File("a.txt"), new File("dest"));
		FileUtils.copyDirectoryToDirectory(new File("dest"), new File("desc2"));
		FileUtils.copyDirectory(new File("dest"), new File("dest3"));
		String address = "http://pic25.nipic.com/20121112/9252150_150552938000_2.jpg";
		FileUtils.copyURLToFile(new URL(address), new File("pic.jpg"));
		String data = IOUtils.toString(new URL("http://www.baidu.com").openStream(), "utf-8");
		System.out.println(data);
	}

}
