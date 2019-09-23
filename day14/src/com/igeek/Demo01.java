package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 1.继承Thread
 * 2.重写run()方法
 * 3.创建子类对象
 * 4.start()方法
 */
public class Demo01 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("敲代码");
		}
	}
	
	public static void main(String[] args) {
		
		Demo01 demo01 = new Demo01();
		//启动
		demo01.start();
		//普通的方法调用
//		demo01.run();
		
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("听歌");
		}
		
	}

}
