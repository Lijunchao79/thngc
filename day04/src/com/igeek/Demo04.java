package com.igeek;

import java.util.ArrayList;

/**
 * @author Administrator
 * 给定一个字符串数组：{“张三丰”,“宋远桥”,“张无忌”,“殷梨亭”,“张翠山”,“莫声谷”}，
 * 将数组中的元素添加到集合中，并把所有姓张的人员打印到控制台上。
 * 
 * 分析：
 * 		A:定义字符串数组
 * 		B:创建集合对象
 * 		C:遍历字符串数组，获取到每一个字符串元素
 * 		D:把获取到的字符串元素添加到集合
 * 		E:遍历集合
 * 			要判断每一个字符串元素是否以"张"开头，如果是，就输出在控制台
 * 
 * 泛型
 */
public class Demo04 {

	public static void main(String[] args) {
		
		String[] str = {"张三丰","宋远桥","张无忌","殷梨亭","张翠山","莫声谷"};
		ArrayList<String> arrayList = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			arrayList.add(str[i]);
		}
		
		for (String name : arrayList) {
			if(name.startsWith("张")) {
				System.out.println(name);
			}
		}
		
	}

}
