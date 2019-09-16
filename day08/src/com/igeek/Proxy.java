package com.igeek;

public class Proxy implements NetWork{
	
	private NetWork network;
	
	public Proxy(NetWork network) {
		super();
		this.network = network;
	}
	
	public void checkNetwork() {
		System.out.println("检查网络的情况");
	}
	
	@Override
	public void brower() {
		checkNetwork();
		network.brower();
	}

}
