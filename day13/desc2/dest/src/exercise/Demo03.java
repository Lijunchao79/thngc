package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @author zx
 * @version 1.0
 * @description:
 * *	分析：
*		1、定义Student类
*		2、创建多个Student对象，放到集合中，数据一共有3个班级，班级1、班级2、班级3，作为初始数据
*		3、定义班级类：
*			班号
*			该班所有的学生
*
*			将该班级所有学生以Map<String,ClassRoom>的方式，存储到Map集合中
*			定义变量，记录Map集合，用于存储所有班级(这里简化需求，只有三个班级，班级1、班级2、班级3)
*			定义三个ArrayList，记录三个班级对象的所有学生信息
*			迭代所有学生初始化数据集合，依次获取到每一个同学
*			判断每个学生是班级1、班级2还是班级3，将该学生放到对应的ArrayList集合中
*			创建三个ClassRoom对象
*			再将三个班级加入到对应的Map集合中
*		4、
*			遍历Map集合，分别拿到每个班级的班级对象
*			获取班级对象中所有学生的列表
*			定义变量，记录总分
*			定义变量，记录平均分
*			循环遍历列表，累加总分
*			计算平均分
*			打印数据
 */
public class Demo03 {

	public static void main(String[] args) {
		
		HashMap<String, ClassRoom> map = new HashMap<>();
		
		//初始化数据
		Student s = new Student("Jack", "班级1", 89);
		Student s2 = new Student("Jack", "班级2", 29);
		Student s3 = new Student("Jack", "班级1", 39);
		Student s4 = new Student("Jack", "班级3", 49);
		Student s5 = new Student("Jack", "班级2", 59);
		Student s6 = new Student("Jack", "班级1", 50);
		Student s7 = new Student("Jack", "班级1", 88);
		
		//所有学生
		ArrayList<Student> students = new ArrayList<>();
		Collections.addAll(students, s,s2,s3,s4,s5,s6,s7);
		
		ArrayList<Student> class1Stus = new ArrayList<>();
		ArrayList<Student> class2Stus = new ArrayList<>();
		ArrayList<Student> class3Stus = new ArrayList<>();
		
		//遍历
		for (Student student : students) {
			if(student.getClass_number().equals("班级1")) {
				class1Stus.add(student);
			}else if (student.getClass_number().equals("班级2")) {
				class2Stus.add(student);
			}else if (student.getClass_number().equals("班级3")) {
				class3Stus.add(student);
			}
		}
		
		//创建三个ClassRoom对象再将三个班级加入到对应的Map集合中
		ClassRoom c1 = new ClassRoom("班级1", class1Stus);
		ClassRoom c2 = new ClassRoom("班级2", class2Stus);
		ClassRoom c3 = new ClassRoom("班级3", class3Stus);
		
		map.put("班级1", c1);
		map.put("班级2", c2);
		map.put("班级3", c3);
		
		//遍历
		Set<String> keySet =  map.keySet();
		
		for (String key : keySet) {
			ClassRoom classRoom = map.get(key);
			ArrayList<Student> sList = classRoom.getStudentList();
			//总分
			double sum = 0;
			//平均分
			double avg = 0;
			for (Student stu : sList) {
				sum += stu.getScore();
			}
			avg = sum/sList.size();
			System.out.println(classRoom.getClassName()+"的总分:"+sum+";平均分:"+avg);
		}
		
	}

}
