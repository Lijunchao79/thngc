package com.igeek;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author zx
 * @version 1.0
 * @description:Collections:工具类
 *可变参数:
*  		参数数量可变
*  
*  	Collections:
*  		public static <T>boolean addAll(Collection c<? super T>, T... elements) 将指定的元素添加到集合
*  
*  	数据类型...代表可变参数.即可以传入任何多个该类型的数据
*  	可变参数不能放在前边,只能放在最后
*  	可变参数的方法与数组的方法不能重载,因为可变参数实质上就是数组
 */
public class Demo07 {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<String>();
		
		Collections.addAll(c, "aa","bb","dd");
		
		System.out.println(c);
		
		System.out.println("*******************");
		System.out.println(add(1,2,3,4,5));

	}
	
	//可变参数
	public static int add(int...number) {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum;
	}

}
