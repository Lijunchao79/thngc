package com.igeek;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Administrator
 * * 创建一个集合，存储学生对象，学生对象的数据来自于键盘录入，最后，遍历集合
 * 
 * 注意：为了方便使用，我把学生类中的所有成员定义为String类型
 * 
 * 分析：
 * 		A:定义学生类
 * 		B:创建集合对象
 * 		C:键盘录入数据,创建学生对象,把键盘录入的数据赋值给学生对象的成员变量
 * 		D:把学生对象作为元素存储到集合中
 * 		E:遍历集合
 */
public class Demo06 {
	
	public static void main(String[] args) {
		
		ArrayList<Stu> arrayList = new ArrayList<>();
		Demo06 demo06 = new Demo06();
		demo06.addStu(arrayList);
		demo06.addStu(arrayList);
		
		for (Stu stu : arrayList) {
			System.out.println(stu);
		}
	}
	
	public void addStu(ArrayList<Stu> arrayList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生姓名:");
		String name = scanner.nextLine();
		System.out.println("请输入学生年龄:");
		String age = scanner.nextLine();
		Stu student = new Stu(name, age);
		arrayList.add(student);
	}

}
