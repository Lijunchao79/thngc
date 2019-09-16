package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption: == 和 equals;
 *  基本类型的数据:就是值得比较
 *  引用类型的数据: 比较内容是否相等，重写equals()方法
 */
public class Demo06 {

	public static void main(String[] args) {

		Student s1 = new Student(1, "zs", 20);

		Student s2 = new Student(1, "zs", 20);
		
		Student s3 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(1==1);

	}

}
