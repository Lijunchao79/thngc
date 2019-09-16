package com.igeek;

public class Demo07 {

	public static void main(String[] args) {
//		Person p = new Student();
//		p.eat();
		
		//定义子类与创建子类对象两个步骤由一个格式一次完成
		Person p = new Person() {
			@Override
			public void eat() {
				System.out.println("吃饭");
			}
		};
		
		p.eat();
		
		Sleep s = new Sleep() {
			@Override
			public void sleep() {
				System.out.println("sleep....");
			}
		};
		
		s.sleep();
		
	}

}
