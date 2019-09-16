package com.igeek;

public class Manager extends Employee implements Driveable{
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
	
	@Override
	public void theoryTest() {
		System.out.println("驾照理论习题1000道");
	}
	
	@Override
	public void fieldDrive() {
		System.out.println("会倒车入库,会侧方停车");
	}
	
	@Override
	public void roadDrive() {
		System.out.println("不撞人,不闯红灯");
		System.out.println("经理开的是高级车奇瑞qq~");
	}

}
