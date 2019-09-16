package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:代理模式
 * 
组成： 抽象角色：通过接口或抽象类声明真实角色实现的业务方法。 
代理角色：实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并可以附加自己的操作。 
真实角色：实现抽象角色，定义真实角色所要实现的业务逻辑，供代理角色调用。
 */
public class Demo01 {
	
	public static void main(String[] args) {
		//委托人
		Server server = new Server();
		//代理人
		Proxy proxy = new Proxy(server);
		proxy.brower();
		
		RealStar realStar = new RealStar();
		ProxyStar proxyStar = new ProxyStar(realStar);
		proxyStar.communicate();
		proxyStar.actor();
		proxyStar.sing();
		
	}

}

