package com.igeek;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//返回一个线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		//创建线程执行目标
		Window02 window02 = new Window02();
		
		//提交任务
		threadPool.submit(window02);
		threadPool.submit(window02);
		threadPool.submit(window02);
		threadPool.submit(window02);
		
		Future<?> future2 = threadPool.submit(window02);
		System.out.println(future2.get());
		
		MyCallable myCallable = new MyCallable();
		//提交任务
		Future<String> future = threadPool.submit(myCallable);
		String msg = future.get();
		System.out.println(msg);
		

	}

}
