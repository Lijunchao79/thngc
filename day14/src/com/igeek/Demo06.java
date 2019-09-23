package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * start()：启动当前线程，执行run方法
 * run():重写run方法，线程的执行逻辑
 * currentThread():静态方法，返回当前执行的线程
 * getName(): 返回该线程的名称
 * setName():改变线程名称
 * yield();放弃执行权;暂停当前正在执行的线程对象，并执行其他线程。
 * join():等待该线程终止。
 * sleep():休眠
 * setPriority():设置优先级；概率高
 */
public class Demo06 extends Thread{
	
	public Demo06(String name) {
		
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			try {
//				//休眠，暂停执行
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			if( i%2 == 0) {
				System.out.println(Thread.currentThread().getName()+"："+i);
			}
			
//			if(i %20 == 0) {
//				yield();
//			}
		}
	}

}
