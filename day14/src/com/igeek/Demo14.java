package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:反射:将类的各个组成部分封装成了其他的对象
 * 好处:
 * 	1.在运行状态中,动态的调用对象
 *  2.解耦，提高程序的可扩展性
 * 
 * Field
 * Method
 * Constructor
 * 
 *  Class对象怎么获取？？？
 *  1.Class.forName("类全名")
 *  2.类名.class
 *  3.对象.getClass()
 *  
 *  同一个字节码文件(.class)，在程序运行过程中，只会加载一次，不论通过何种方式获取Class对象，都是同一个
 */
public class Demo14 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		//1.Class.forName("类全名")
		Class cls = Class.forName("com.igeek.Student");
		System.out.println(cls);
		//2.类名.class
		Class cls2 = Student.class;
		System.out.println(cls2);
		//3.对象.getClass();
		Student stu = new Student();
		Class cls3 = stu.getClass();
		System.out.println(cls3);
		
		System.out.println(cls == cls2);
		System.out.println(cls2 == cls3);
		
		Class p = Person.class;
		System.out.println(p == cls);
		
		
		
	}
	
	

}
