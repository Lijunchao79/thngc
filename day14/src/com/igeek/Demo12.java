package com.igeek;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zx
 * @version 1.0
 * @description:Callable，创建线程的第三种方式
 */
public class Demo12 implements Callable<Boolean> {

	private String address;
	private String name;

	public Demo12(String address, String name) {
		super();
		this.address = address;
		this.name = name;
	}

	@Override
	public Boolean call() throws Exception {
		// 下载图片
		WebDownLoad webDownLoad = new WebDownLoad();
		webDownLoad.download(address, name);
		return true;
	}
	
	public static void main(String[] args) {
		//创建线程池
		ExecutorService etr = Executors.newFixedThreadPool(1);
		
		Demo12 demo02 = new Demo12("http://pic25.nipic.com/20121112/9252150_150552938000_2.jpg", 
				"test11.jpg");
		Demo12 demo022 = new Demo12("http://pic1.win4000.com/wallpaper/c/53cdd1f7c1f21.jpg", 
				"test12.jpg");
		Demo12 demo023 = new Demo12("http://img.redocn.com/sheying/20140731/qinghaihuyuanjing_2820969.jpg", 
				"test13.jpg");
		
		Future<Boolean> flag = etr.submit(demo02);
		etr.submit(demo022);
		etr.submit(demo023);
		System.out.println(flag);
		
		//关闭服务
		etr.shutdown();
	}


}
