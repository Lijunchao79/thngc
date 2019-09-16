package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 *  A:构造方法:
	StringBuilder()
	B:成员方法:
  	public int capacity():返回当前容量 (理论值)
	public int length():返回长度(已经存储的字符个数)
	public StringBuilder append(任意类型):添加数据，并返回自身对象
	public StringBuilder reverse():反转功能
 */
public class Demo19 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world");
		sb.append(true);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
