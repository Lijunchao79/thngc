package com.igeek.statictest;

import com.igeek.utils.ArrUtils;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * Ctrl+shift+x:大写
 * Ctrl+shift+y:小写
 */
public class Circle {
	
	private double radius;
	
	public static int TOTAL;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
		TOTAL++;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(4);
		Circle c3 = new Circle(4);
		System.out.println(c1.area());
		System.out.println(c2.area());
		System.out.println(c3.area());
		System.out.println(Circle.TOTAL);
	}

}
