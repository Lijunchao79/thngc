package com.igeek;

public class BmFactory implements IFactory{

	@Override
	public Car getCar() {
		return new Bm();
	}

}
