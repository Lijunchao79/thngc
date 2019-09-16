package com.igeek.statictest;

/**
 * @author zx
 * @version 1.0
 * @descroption:static
 * static修饰的成员属于类，但是会影响每一个对象。
 * static修饰变量，方法
 * 
 * 静态变量随着类的加载而加载，类名.变量
 * 类加载一次
 * 
 * static 不能使用this关键字
 * 
 * 非静态的是可以调用静态的和非静态的
 * 
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		//The static field Chinese.nation should be accessed in a static way
		Chinese c1 = new Chinese("zs", 20);
		System.out.println(c1.getName()+";"+c1.getAge());
		System.out.println(Chinese.nation);
		System.out.println(c1.nation);
		Chinese.nation = "CHINA";
		
		Chinese c2 = new Chinese("ls", 20);
		System.out.println(c2.getName()+";"+c2.getAge());
		System.out.println(Chinese.nation);
		
//		Demo01 demo01 = new Demo01();
		//The static method print() from the type Demo01 should be accessed in a static way
//		Demo01.print();
		
//		Chinese.walk();
		c2.eat();
		
		System.out.println(Math.PI);
		
	}

}


class Chinese {
	private String name;
	private int age;
	//国籍
	static String nation = "中国";
	
	public Chinese(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void print() {
		System.out.println("我是中国人");
		//Cannot make a static reference to the non-static method eat() from the type Chinese
//		eat();
//		walk();
//		System.out.println(Chinese.nation);
//		Cannot make a static reference to the non-static field name
//		System.out.println(name);
	}
	
	public void eat(String food) {
		eat();
		System.out.println("吃"+food);
	}
	
	public void eat() {
		System.out.print("中餐 ");
		print();
		System.out.println(Chinese.nation);
	}
	
	public static void walk() {
		System.out.println("散步....");
	}
}
