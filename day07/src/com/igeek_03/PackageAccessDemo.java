package com.igeek_03;

import com.igeek_03.other1.PersonOther;

public class PackageAccessDemo {
	public static void main(String[] args) {

		// JRE提供的lang包下的类,是可以直接使用类名,无需加包名的,比如String
		String s = "hit the road";

		// 同包访问时,可以省略全名,使用类名
		Person person = new Person("Jack");
		System.out.println(person.getName());

		// 跨包访问,需要先导包,再使用
		PersonOther Person2 = new PersonOther("Rose");
		System.out.println(Person2.getName());

		// 不能导入相同名称的类,所以,当多个文件夹下有相同的类名时，只能有一个导包使用，其他必须仍然书写全名
		com.igeek_03.other2.PersonOther Person3 = new com.igeek_03.other2.PersonOther("Rose");
		System.out.println(Person3.getName());

	}

}
