package com.igeek;

public class Demo02 extends Thread{
	
	private String address;
	private String name;
	
	public Demo02(String address, String name) {
		super();
		this.address = address;
		this.name = name;
	}

	@Override
	public void run() {
		//下载图片
		WebDownLoad webDownLoad = new WebDownLoad();
		webDownLoad.download(address, name);
	}
	
	public static void main(String[] args) {
		
		Demo02 demo02 = new Demo02("http://pic25.nipic.com/20121112/9252150_150552938000_2.jpg", 
				"test01.jpg");
		Demo02 demo022 = new Demo02("http://pic1.win4000.com/wallpaper/c/53cdd1f7c1f21.jpg", 
				"test02.jpg");
		Demo02 demo023 = new Demo02("http://img.redocn.com/sheying/20140731/qinghaihuyuanjing_2820969.jpg", 
				"test03.jpg");
		
		//启动三个线程
		demo02.start();
		demo022.start();
		demo023.start();
		
	}

}
