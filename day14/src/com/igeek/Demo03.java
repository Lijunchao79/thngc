package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:Runnable接口
 * 1.实现Runnable接口
 * 2.重写run()
 * 3.创建子类对象
 * 4.创建thread,通过该对象调用start()方法，启动线程
 */
public class Demo03 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("听歌");
		}
	}
	
	public static void main(String[] args) {
		
		Demo03 demo03 = new Demo03();
		
		Thread thread = new Thread(demo03);
//		thread.start();
		thread.run();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("敲代码");
		}
		
	}

}
