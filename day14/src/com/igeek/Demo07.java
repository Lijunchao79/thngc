package com.igeek;

public class Demo07 {
	
	public static void main(String[] args) {
		Demo06 demo06 = new Demo06("线程一");
		
//		demo06.setName("线程一");
		demo06.setPriority(Thread.MAX_PRIORITY);
		demo06.start();
//		try {
//			demo06.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Thread.currentThread().setName("主线程");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		for (int i = 0; i < 100; i++) {
			if( i%2 != 0) {
				System.out.println(Thread.currentThread().getName()+"："+i);
			}
		}
	}

}
