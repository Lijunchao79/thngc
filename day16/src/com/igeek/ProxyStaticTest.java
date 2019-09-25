package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:代理模式
 * 静态代理：代理类和被代理类在编译期间就已经确定了
 */
public class ProxyStaticTest {

	public static void main(String[] args) {
		//创建被代理的对象
		ClothFactory nike = new NikeClothFactory();
		//创建代理的对象
		ClothFactory proxyCloth = new ProxyCloth(nike);
		proxyCloth.produceCloth();
		
		System.out.println("*******************");
		Human student = new Student();
		ProxyStudent proxyStudent = new ProxyStudent(student);
		proxyStudent.eat("apple");
		
	}
}

//被代理类
class NikeClothFactory implements ClothFactory{

	@Override
	public void produceCloth() {
		System.out.println("生成运动服......");
	}
}

//代理类
class ProxyCloth implements ClothFactory{
	
	private ClothFactory clothFactory;
	
	public ProxyCloth(ClothFactory clothFactory) {
		super();
		this.clothFactory = clothFactory;
	}

	@Override
	public void produceCloth() {
		System.out.println("代理工厂的准备工作......");
		clothFactory.produceCloth();
		System.out.println("代理工厂首尾的工作......");
	}
	
}

//被代理类
class Student implements Human{

	@Override
	public void eat(String food) {
		System.out.println("eat "+food);
	}
}

//代理类
class ProxyStudent implements Human{
	
	private Human human;
	
	public ProxyStudent(Human human) {
		super();
		this.human = human;
	}

	@Override
	public void eat(String food) {
		//System.out.println("洗手");
		human.eat(food);
		//System.out.println("洗碗");
	}
	
}











