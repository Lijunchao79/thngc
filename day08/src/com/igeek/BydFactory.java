package com.igeek;

public class BydFactory implements IFactory{

	@Override
	public Car getCar() {
		return new Byd();
	}

}
