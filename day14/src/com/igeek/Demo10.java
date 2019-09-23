package com.igeek;

public class Demo10 {

	public static void main(String[] args) {
		
		Window02 window02 = new Window02();
		
		Thread thread01 = new Thread(window02);
		Thread thread02 = new Thread(window02);
		Thread thread03 = new Thread(window02);
		
		thread01.start();
		thread02.start();
		thread03.start();
		

	}

}
