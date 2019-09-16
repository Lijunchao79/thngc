package com.igeek;

public class Manager extends Employee{
	
	private double bonus;
	
	public Manager() {
		super();
	}

	public Manager(String name, double salary,double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("管理酒店");
	}

}
