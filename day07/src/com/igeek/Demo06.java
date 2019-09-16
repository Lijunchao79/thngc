package com.igeek;

//The type Demo06 cannot subclass the final class FinalClass
public class Demo06 /* extends FinalClass */{
	
	public static final int a=10;
	
	// 被final修饰方法:无法被重写
	public final void name() {
		System.out.println("final......");
	}
	
}
