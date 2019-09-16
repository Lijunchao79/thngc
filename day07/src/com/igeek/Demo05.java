package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:implements,实现接口,可以实现多个接口
 */
public class Demo05 implements Demo04,Fly{

	@Override
	public void name() {
		//The final field Demo04.PI cannot be assigned
//		PI = 2;
	}

	@Override
	public void name1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		//接口不可以new 
//		Fly fly = new Fly();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
