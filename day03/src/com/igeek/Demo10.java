package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * * String类的获取功能：
	* 	int length():获取字符串的长度，其实也就是字符个数
	* 	char charAt(int index):获取指定索引处的字符
	* 	int indexOf(String str):获取str在字符串对象中第一次出现的索引
	* 	String substring(int start):从start开始截取字符串
	* 	String substring(int start,int end):从start开始，到end结束截取字符串。包括start，不包括end
 */
public class Demo10 {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.length());
		//java.lang.StringIndexOutOfBoundsException
		char ch = str.charAt(str.length()-1);
		System.out.println(ch);
		int index = str.indexOf("l");
		System.out.println(index);
		String str2 = "unhappy";
		String str3 = "Harbison";
		String str4 = "emptiness";
		System.out.println(str2.substring(2));;
		System.out.println(str3.substring(3));
		//an empty string ""
		System.out.println(str4.substring(9));
		//[start,end)
		System.out.println(str4.substring(2, 5));
	}

}
