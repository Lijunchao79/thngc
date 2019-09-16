package com.igeek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * 1.format()
 * 2.parse()
 */
public class Demo16 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf3 = new SimpleDateFormat("D");
		
		String dateStr = sdf.format(new Date());
		System.out.println(dateStr);
		String dateStr2 = sdf2.format(new Date());
		System.out.println(dateStr2);
		String dateStr3 = sdf3.format(new Date());
		System.out.println(dateStr3);
		
		String str1 = "2019-09-12 15:32:07";
		Date date = sdf.parse(str1);
		System.out.println("date:"+date);

	}

}
