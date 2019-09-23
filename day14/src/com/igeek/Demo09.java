package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 火车站有多个售票窗口，这些售票窗口一块卖100张票，即100张票被多个窗口共享。
	用线程模拟售票窗口；用输出语句模拟卖出的票。
 */
public class Demo09 {

	public static void main(String[] args) {
		
		Window window1 = new Window();
		window1.setName("窗口1");
		Window window2 = new Window();
		window2.setName("窗口2");
		Window window3 = new Window();
		window3.setName("窗口3");
		
		window1.start();
		window2.start();
		window3.start();

	}

}
