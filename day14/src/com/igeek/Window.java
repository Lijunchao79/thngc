package com.igeek;

public class Window extends Thread{
	
	private static int ticket = 100;
	
	@Override
	public void run() {
		
		while(true) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+":"+ticket);
				ticket--;
			}else {
				break;
			}
		}
		
	}

}
