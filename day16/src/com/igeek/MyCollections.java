package com.igeek;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

@SuppressWarnings("all")
public class MyCollections {
	
	/**
	 * @param list
	 * @return
	 * 该类中定义一个unmodifiableList方法实现，使用动态代理对该方法增强，使list对象不能再加入元素
	 */
	public static List<String> unmodifiableList(final List<String> list) {
		
		
		ClassLoader classLoader = MyCollections.class.getClassLoader();
		Class[] inters = list.getClass().getInterfaces();
		
		
		List<String> proxyList  = (List<String>) Proxy.newProxyInstance(classLoader, inters, new InvocationHandler() {
			
			//代理类的每一个方法调用一次，处理类invoke方法都执行一次
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				//1 获得方法名
				String name = method.getName();
				//2 eq不同方法的处理
				if("add".equals(name)) {  
					throw new UnsupportedOperationException("add操作不支持!!!");
				}
				//处理类中直接执行目标类对应的方法
				return method.invoke(list, args);
			}
		});
		return proxyList;
	}
	

}
