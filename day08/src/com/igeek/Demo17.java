package com.igeek;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo17 {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println(calendar);
		System.out.println(calendar.get(Calendar.YEAR));
		//月份从0开始
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println("**********************************");
		//天数
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		//星期天 星期一........
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		//set()
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.set(Calendar.YEAR, 2020);
		System.out.println(calendar2.get(Calendar.YEAR));
		//add()
		calendar2.add(Calendar.YEAR, 5);
		System.out.println(calendar2.get(Calendar.YEAR));
		System.out.println("**********************************");
		//getTime()
		Date date = calendar.getTime();
		System.out.println(date);
		System.out.println("**********************************");
		//setTime()
		GregorianCalendar calendar3 = new GregorianCalendar();
		calendar3.setTime(new Date());
		System.out.println(calendar3);
		
//		Date date2 = new Date();
//		int year = date2.getYear();
//		System.out.println(year);
		
		Calendar calendar4 = Calendar.getInstance();
		System.out.println(calendar4);

	}

}
