package com.igeek;

import java.io.IOException;
import java.text.ParseException;
import java.util.zip.DataFormatException;

public class Demo10 {
	
	// 如果父类抛出了多个异常,子类覆盖父类方法时,只能抛出相同的异常或者是他的子集
	class Fu{
		public void method () throws IOException,ParseException,DataFormatException{
			System.out.println("Fu ....");
		}
		
	}
	
	class Zi extends Fu {
		
		@Override
		public void method() throws IOException, ParseException, DataFormatException {
			// TODO Auto-generated method stub
			super.method();
		}
		
	}
	
	

}
