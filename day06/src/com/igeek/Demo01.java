package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:this
 * 
 * this 可以修饰：属性，方法，构造器
 * 
 * this:当前对象
 * 
 * this:  
 * 1.this(参数列表)显示的调用其他构造方法
 * 2.this不能自己调用自己
 * 3.this(参数列表)必须声明在首行
 * 
 */
public class Demo01 {
	
	String name;
	int age;

	public Demo01() {
		System.out.println("无参");
	}

	public Demo01(String name) {
		this();
		this.name = name;
		System.out.println("带参");
	}

	public Demo01(String name, int age) {
		//Constructor call must be the first statement in a constructor
		this(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
		print();
	}
	
	public void print() {
		System.out.println("print....");
	}
	
	public static void main(String[] args) {
		Demo01 demo01 = new Demo01("zx",20);
		System.out.println(demo01.name);
	}

}
