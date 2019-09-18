package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 1.HashMap hashMap = new HashMap(),底层没有初始化一个长度为16的Node[]数组;
 * 2.第一次put的时候，初始化一个长度为16的Node[]数组;
 * 3.计算元素的哈希值
 * 4.通过hash(h & length -1)确定索引的位置
 * 5.该位置上没有元素直接添加
 * 6.该位置上有多个元素(链表的形式)
 * 	 比较hash值：
 *     1.hash值不相同，元素添加成功
 *     2.hash值相同，就需要进一步调用equals()来判断；返回true，替换,false,添加。
 *     
 * 备注：1.7：数组加链表；1.8：数组+链表+红黑树
 */
public class Demo04 {

	public static void main(String[] args) {
		Stu[] stus;
	}

}
