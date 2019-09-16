package com.igeek;

public class Waiter extends Employee implements Driveable{
	
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
	
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		waiter.work();
		Manager manager = new Manager();
		manager.work();
		Chief chief = new Chief();
		chief.work();
	}

	@Override
	public void theoryTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fieldDrive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roadDrive() {
		// TODO Auto-generated method stub
		
	}

}
