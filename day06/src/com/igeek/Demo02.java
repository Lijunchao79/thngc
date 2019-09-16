package com.igeek;

public class Demo02 {
	
	public static void main(String[] args) {
		Boy boy = new Boy("Jack", 23);
		boy.say();
		Girl girl = new Girl("Rose", 24);
		girl.marry(boy);
		//匿名对象即没有引用的对象
		new Boy().say();
	}

}
