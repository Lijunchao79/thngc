package com.igeek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author zx
 * 
 *         需求：
 *          A:键盘录入3个学生信息(学号,姓名,年龄,居住地)存入集合,要求学生信息的学号不能重复 
 *          B:遍历集合把每一个学生信息存入文本文件
 *          C:每一个学生信息为一行数据,每行学生的学号,姓名,年龄和居住地在文件中均以逗号分隔
 */
public class Demo22 {

	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<>();

		addStudent(arrayList);
		addStudent(arrayList);
		addStudent(arrayList);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("stu.txt"));){
			//遍历
			for (int i = 0; i < arrayList.size(); i++) {
				Student stu = arrayList.get(i);
				StringBuilder sb = new StringBuilder();
				sb.append(stu.getId()+","+stu.getName()+","+stu.getAge()+","+stu.getAddress());
				bw.write(sb.toString());
				bw.newLine();
				bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void addStudent(ArrayList<Student> array) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 为了让id能够被访问到，我们就把id定义在了循环的外面
		String id;

		// 为了让代码能够回到这里，用循环
		while (true) {
			System.out.println("请输入学生学号：");
			// String id = sc.nextLine();
			id = sc.nextLine();

			// 判断学号有没有被人占用
			// 定义标记
			boolean flag = false;
			// 遍历集合，得到每一个学生
			for (int x = 0; x < array.size(); x++) {
				Student s = array.get(x);
				// 获取该学生的学号，和键盘录入的学号进行比较
				if (s.getId().equals(id)) {
					flag = true; // 说明学号被占用了
					break;
				}
			}

			if (flag) {
				System.out.println("你输入的学号已经被占用,请重新输入");
			} else {
				break; // 结束循环
			}
		}

		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生居住地：");
		String address = sc.nextLine();

		// 创建学生对象
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		// 把学生对象作为元素添加到集合
		array.add(s);

		// 给出提示
		System.out.println("添加学生成功");

	}

}
