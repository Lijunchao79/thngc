package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:泛型方法
 * 
 * 在调用泛型方法,并且传入实参的时候才能确定方法上形参的类型
 * 修饰符 <T,Q,E……> 返回值类型 方法名(T t,Q q,……){//方法上的泛型定义在返回值的前面
 * }
 */
public class Demo12 {
	
	public <T> void method(T t) {
		System.out.println(t);
	}

}
