package com.igeek;

public class Demo07 {

	public static void main(String[] args) {

		Manager manager = new Manager("zs", 10000, 20000);
		Waiter waiter1 = new Waiter("xm", 8000);
		Waiter waiter2 = new Waiter("xh", 8000);
		Waiter waiter3 = new Waiter("xh", 8000);
		Chief chief = new Chief("jack", 30000);

//		manager.work();
//		waiter1.work();
//		waiter2.work();
//		chief.work();
		
		System.out.println(totalSalary(manager,waiter1,waiter2,waiter3,chief));
	}

	// 可变参数
	public static double totalSalary(Employee... employee) {
		double salary = 0;
		for (Employee employe : employee) {
			employe.work();
			salary += employe.getSalary();
		}
		return salary;
	}

}
