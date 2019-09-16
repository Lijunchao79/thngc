package com.igeek;

//被代理的类
public class Server implements NetWork{

	@Override
	public void brower() {
		System.out.println("真实的服务器访问");
	}

}
