package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 需求：
 * 创建两个线程，一个线程遍历100以内的偶数；一个线程遍历100以内的奇数
 */
public class Demo05 {
	
	public static void main(String[] args) {
		/*Mythread01 mythread01 = new Mythread01();
		Mythread02 mythread02 = new Mythread02();
		
		mythread01.start();
		mythread02.start();*/
		
//		Mythread03 mythread03 = new Mythread03();
//		Thread thread01 = new Thread(mythread03);
//		Mythread04 mythread04 = new Mythread04();
//		Thread thread02 = new Thread(mythread04);
//		thread01.start();
//		thread02.start();
		
		//创建thread类的匿名子类来实现
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					if( i%2 == 0) {
						System.out.println(Thread.currentThread().getName()+"："+i);
					}
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					if( i%2 != 0) {
						System.out.println(Thread.currentThread().getName()+"："+i);
					}
				}
			}
		}.start();
		
	}

}
//方法1
class Mythread01 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if( i%2 == 0) {
				System.out.println(Thread.currentThread().getName()+"："+i);
			}
		}
	}
}

class Mythread02 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if( i%2 != 0) {
				System.out.println(Thread.currentThread().getName()+"："+i);
			}
		}
	}
}

//方法2
class Mythread03 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if( i%2 != 0) {
				System.out.println(Thread.currentThread().getName()+"："+i);
			}
		}
	}
}

class Mythread04 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if( i%2 != 0) {
				System.out.println(Thread.currentThread().getName()+"："+i);
			}
		}
	}
}










