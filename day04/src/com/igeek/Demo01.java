package com.igeek;

/**
 * @author Administrator
 * 对象数组
 */
public class Demo01 {
	public static void main(String[] args) {
		
		int[] a = new int[3];
		
		Student[] stus = new Student[3];
		//Type mismatch: cannot convert from int to Student
		Student s1 = new Student("zs", 12);
		stus[0] = s1;
		for (int i = 0; i < stus.length; i++) {
			Student s = stus[i];
			System.out.println(s);
		}
		
		
	}

}
