package com.igeek;

public class Demo04 implements Runnable {

	private String address;
	private String name;

	public Demo04(String address, String name) {
		super();
		this.address = address;
		this.name = name;
	}

	@Override
	public void run() {
		// 下载图片
		WebDownLoad webDownLoad = new WebDownLoad();
		webDownLoad.download(address, name);
	}
	
	public static void main(String[] args) {
		Demo04 demo02 = new Demo04("http://pic25.nipic.com/20121112/9252150_150552938000_2.jpg", 
				"test01.jpg");
		Demo04 demo022 = new Demo04("http://pic1.win4000.com/wallpaper/c/53cdd1f7c1f21.jpg", 
				"test02.jpg");
		Demo04 demo023 = new Demo04("http://img.redocn.com/sheying/20140731/qinghaihuyuanjing_2820969.jpg", 
				"test03.jpg");
		
		//启动三个线程
		new Thread(demo02).start();
		new Thread(demo022).start();
		new Thread(demo023).start();
		
		
	}

}
