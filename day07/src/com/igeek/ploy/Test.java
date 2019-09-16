package com.igeek.ploy;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 三要素：
 * 1.继承关系，实现关系
 * 2.父类的引用指向子类
 * 3.重写方法
 */
public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.sleep();
		p.study();
		p.work();
		System.out.println("=====================");
		//多态
		//向上转型
		Animal a = new Person();
		a.eat();
		a.sleep();
		//向下转型
		Person p2 = (Person) a;
		p2.study();
		p2.work();
		System.out.println("=====================");
		Dog xh = new Dog();
		method(xh);
		method(p);
		
//		a.study();
//		a.work();
		
		//instanceof 
//		System.out.println(p instanceof Person);
//		System.out.println(p instanceof Animal);
//		System.out.println(p instanceof Object);
		
	}
	
	public static void method(Animal a) {
		
		a.eat();
		a.sleep();
		
		if(a instanceof Dog) {
			//强转
			Dog dog = (Dog)a;
			dog.shout();
		}
		
		if(a instanceof Person) {
			//强转
			Person p = (Person)a;
			p.study();
			p.work();
		}
		
	}

}
