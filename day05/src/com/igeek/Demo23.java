package com.igeek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo23 {

	public static void main(String[] args) throws IOException {
		// 创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("stu.txt"));

		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();

		// 读取文件数据，并把数据按照一定的格式进行分割赋值给学生对象，然后把学生对象作为元素存储到集合
		String line;
		while ((line = br.readLine()) != null) {
			// 分割字符串
			String[] strArray = line.split(",");
			// 创建学生对象并赋值
			Student s = new Student();
			s.setId(strArray[0]);
			s.setName(strArray[1]);
			s.setAge(strArray[2]);
			s.setAddress(strArray[3]);
			// 把学生对象作为元素存储到集合
			array.add(s);
		}

		// 释放资源
		br.close();

		// 遍历集合
		System.out.println("学号\t姓名\t年龄\t居住地");
		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
		}

	}

}
