package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:四种权限访问修饰符的测试
 */
public class AccessClass {
	private void method() {
		System.out.println("私有化的方法");
	}
	void method2() {
		System.out.println("默认权限的方法");
	}
	
	protected void method3() {
		System.out.println("受保护的方法");
	}
	
	public void method4() {
		System.out.println("公共的方法");
	}
	
	public static void main(String[] args) {
		
		//本类中，都可以
		AccessClass accessClass = new AccessClass();
		accessClass.method();
		accessClass.method2();
		accessClass.method3();
		accessClass.method4();
	}
	
	
}
