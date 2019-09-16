package com.igeek;

public class Waiter extends Employee {
	
	public Waiter() {
		super();
	}

	public Waiter(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void work() {
		System.out.println("上菜与结账");	
	}

}
