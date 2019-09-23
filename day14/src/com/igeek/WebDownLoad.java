package com.igeek;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class WebDownLoad {
	
	public void download(String address,String name) {
		try {
			FileUtils.copyURLToFile(new URL(address), new File(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
