package com.igeek.ploy;

public class Izi implements Ifu{
	
	@Override
	public void method() {
		System.out.println("Izi......");
	}
	
	public static void main(String[] args) {
		Ifu ifu = new Izi();
		ifu.method();
	}

}
