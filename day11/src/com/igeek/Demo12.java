package com.igeek;

import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @version 1.0
 * @description:
 *数组转集合
* Arrays:
* 	public static <T> List<T> asList(T... a)				
* 
* 	UnsupportedOperationException:不支持的添加或者删除操作
 */
public class Demo12 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jack","Rose","Trump");
		
//		names.add("zs");
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
