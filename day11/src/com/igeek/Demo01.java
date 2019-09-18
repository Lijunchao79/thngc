package com.igeek;

import java.util.HashMap;

/**
 * @author zx
 * @version 1.0
 * @description:HashMap:键值对
 * put();
 * get();
 */
public class Demo01 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		//添加
		map.put("姓名", "Jack");
		map.put("性别", "男");
		map.put("年龄", "18");
		map.put("分数", "18");
		//获取
		String name = map.get("姓名");
		System.out.println(name);
		
		System.out.println(map);
		
		System.out.println(map.size());
	}

}
