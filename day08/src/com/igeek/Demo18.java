package com.igeek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 根据用户输入的日期，打印当前月份的日历（打印在控制台上）
 */
public class Demo18 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请用户输入日期(格式：2019-09-12):");
		String dateTime = scanner.nextLine();
		System.out.println("输入日期:"+dateTime);
		//格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateTime);
		//Calendar对象
		GregorianCalendar calendar = new GregorianCalendar();
//		GregorianCalendar calendar2 = new GregorianCalendar(year, month, dayOfMonth)
		calendar.setTime(date);
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		//置为1
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int firstDay = calendar.get(Calendar.DAY_OF_MONTH);
		
		int temp = calendar.get(Calendar.DAY_OF_WEEK);
		//获取当前天数的最大值
		int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		//控制 1号的位置
		for (int i = 0; i < temp-1 ; i++) {
			System.out.print("\t");
		}
		
		for (int i = firstDay; i <= max; i++) {
			//周六换行
			if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
				System.out.println();
			}else if(calendar.get(Calendar.DAY_OF_MONTH) == currentDay) {
				System.out.print("["+calendar.get(Calendar.DAY_OF_MONTH)+"]\t");
			}
			else {
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
			}
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
	}

}
