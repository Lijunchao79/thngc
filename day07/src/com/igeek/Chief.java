package com.igeek;

public class Chief extends Employee {
	
	public Chief() {
		super();
	}

	public Chief(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void work() {
		System.out.println("做饭");
	}
	
}
