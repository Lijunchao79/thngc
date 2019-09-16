package com.igeek;

public class Demo21 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("closing......");
	}
	
	public void print() {
		System.out.println("myAutoCloseable......");
	}

}
