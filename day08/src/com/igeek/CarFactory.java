package com.igeek;

//工厂类
public class CarFactory {
	
	public static Car getCar(String type) {
		if(type.equals("bm")) {
			return new Bm();
		}else if (type.equals("byd")) {
			return new Byd();
		}else {
			return null;
		}
	}
	
	public static Car getCarBm() {
		return new Bm();
	}

}
