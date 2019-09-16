package com.igeek;

public class Driver extends Employee implements Driveable{
	
	@Override
	public void work() {
		System.out.println("上班接人,下班送人");	
	}

	@Override
	public void theoryTest() {
		System.out.println("驾照理论习题1000道");		
	}

	@Override
	public void fieldDrive() {
		System.out.println("会倒车入库,会侧方停车");
		System.out.println("坡道起步");
	}

	@Override
	public void roadDrive() {
		System.out.println("不撞人,不闯红灯,不超员");
		System.out.println("以前开公交,现在开大巴");
	}

}
