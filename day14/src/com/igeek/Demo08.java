package com.igeek;

public class Demo08 {

	public static void main(String[] args) {
		// 方式一：
		Thread thread = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					if (i % 2 == 0) {
						System.out.println(Thread.currentThread().getName() + "：" + i);
					}
				}
			}
		};
		thread.start();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					if (i % 2 == 0) {
						System.out.println(Thread.currentThread().getName() + "：" + i);
					}
				}
			}
		}.start();

		// 方式2：
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName() 
							+ "：coding.......");
				}
			}
		};
		// 通过目标创建线程对象
		Thread thread2 = new Thread(runnable);
		// 开启线程
		thread2.start();
		//接口不能new
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName() 
							+ "：sing.......");
				}
			}
		});
		thread3.start();
	}

}
