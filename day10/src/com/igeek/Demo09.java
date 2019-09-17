package com.igeek;

import java.util.HashSet;

/**
 * @author zx
 * @version 1.0
 * @description:
 * HashSet添加元素的时候:
 * 1.计算元素的哈希值
 * 2.通过某个法则确定索引的位置
 * 3.该位置上没有元素直接添加
 * 4.该位置上有多个元素(链表的形式)
 * 	 比较hash值：
 *     1.hash值不相同，元素添加成功
 *     2.hash值相同，就需要进一步调用equals()来判断；返回true,添加失败，反之。
 */
public class Demo09 {

	public static void main(String[] args) {
		HashSet<Person> hashSet = new HashSet<>();
		Person p = new Person("jack", 20);
		Person p2 = new Person("rose", 21);
		hashSet.add(p);
		hashSet.add(p2);
		hashSet.add(new Person("jack", 20));
		
		System.out.println(hashSet);
	}

}
