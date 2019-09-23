package com.igeek;

public class Window02 implements Runnable{
	
	private int ticket = 100;

	@Override
	public void run() {
		while(true) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			if(ticket >0 ) {
				System.out.println(Thread.currentThread().getName()+":"+ticket--);
			}else {
				break;
			}
		}
	}

}
