package com.igeek;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zx
 * @version 1.0
 * @description:动态代理
 * 核心:Proxy.newProxyInstance(类加载器,接口,InvocationHandler接口)
 * 1.根据被代理类，动态的为它创建一个代理类 ;
 * 2.通过代理类调用方法的时候，动态的去调用被代理类的同名方法
 */
public class ProxyTest {
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		//产生代理对象
		Human proxyObject = (Human) ProxyFactory.getProxyInstance(stu);
		proxyObject.eat("apple");
		System.out.println("************************************");
		NikeClothFactory nike = new NikeClothFactory();
		ClothFactory clothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nike);
		clothFactory.produceCloth();
	}

}

class ProxyFactory {
	/**
	 * @param obj:被代理类
	 * @return Object:代理类
	 */
	public static Object getProxyInstance(Object obj) {
		MyInvocationHandler handler = new MyInvocationHandler();
		handler.bind(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), 
				handler);
	}
}

class MyInvocationHandler implements InvocationHandler{
	private Object obj;//被代理类
	public void bind(Object obj) {
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//obj：被代理的对象
		return method.invoke(obj, args);
	}
}



