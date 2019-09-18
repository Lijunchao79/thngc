package com.igeek;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 第1种遍历方式是，使用Map集合的keySet()方法
	A:思路：
	* 通过keySet()方法获取所有键的集合
	* 遍历键的集合，获取到每一个键
	* 根据键找值
 */
public class Demo02 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		//添加
		map.put("姓名", "Jack");
		map.put("性别", "男");
		map.put("年龄", "18");
		map.put("分数", "18");
		
		//遍历
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
			String key = iterator.next();
			//根据键获取value
			String value = map.get(key);
			System.out.println(key+"=======>"+value);
		}
		
		System.out.println("************************");
		for (String key : keySet) {
			//根据键获取value
			String value = map.get(key);
			System.out.println(key+"=======>"+value);
		}

	}

}
