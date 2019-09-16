package com.igeek;

import java.util.Date;

/**
 * @author zx
 * @version 1.0
 * @descroption:Date类
 * //获取当前时间对象的毫秒值
 * *Date date = new Date();
 * 
 * *public long getTime() 
 * 
 * //设置时间毫秒值 
 * public void setTime(long time)  
 */
public class Demo15 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		date.setTime(1000);
		System.out.println(date);
		
		long sec = date.getTime();
		System.out.println(sec);
		
		Date date2 = new Date(sec);
		System.out.println(date2);

	}

}
