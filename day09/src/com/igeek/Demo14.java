package com.igeek;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 泛型通配符：?
	定义：(查看ArrayList的构造方法)无法在类中使用
	使用：调用方法时可以给予任意类型。参照Arraylist的构造方法
	? extends E代表只要是E类型的子类即可
	? super E代表只要是E类型的父类即可
 */
public class Demo14 {

	public static void main(String[] args) {
		
		// 定义集合b,包含3个元素
		ArrayList<String> listB = new ArrayList<String>();
		listB.add("Jack");
		listB.add("Rose");
		listB.add("Trump");

		// 使用集合b创建集合a
		// listB中的元素类型String必须是listA中元素类型Object的子类
		ArrayList<Object> listA = new ArrayList<Object>(listB);
		listA.add("Obama");

		// 观察集合A
		System.out.println(listA);

	}

}
