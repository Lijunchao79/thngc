package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:super
 * super:是直接父类对象的引用；通过super调用被覆盖的父类的方法或者属性
 */
public class Demo04 {

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.fun();
	}

}

class FatherClass{
	public int value;
	public String name;
	public void fun() {
		value = 100;
		name = "zs";
		System.out.println("FatherClass.value :"+value);
	}
}

class ChildClass extends FatherClass{
	public int value;
	public String name;
	
	@Override
	public void fun() {
		super.fun();//调用父类的方法
		value = 200;
		System.out.println("ChildClass.value :"+value);
		System.out.println(value);
		System.out.println(super.value);//调用父类的属性
		System.out.println(name);
		System.out.println(super.name);
	}
}






