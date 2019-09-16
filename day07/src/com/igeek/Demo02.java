package com.igeek;

//子类通过方法重写来完成
public class Demo02 extends Demo01{

	@Override
	public void print() {
		System.out.println("Demo02......");
	}
	
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02();
		demo02.print();
	}

}
