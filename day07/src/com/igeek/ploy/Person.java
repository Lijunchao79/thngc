package com.igeek.ploy;

public class Person extends Animal{
	
	@Override
	public void eat() {
		System.out.println("用工具吃饭");
	}

	@Override
	public void sleep() {
		System.out.println("在床上躺着睡觉");
	}
	
	public void study() {
		System.out.println("读书");
	}
	
	public void work() {
		System.out.println("程序猿/程序媛");
	}

}
