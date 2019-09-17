package com.igeek;

import java.util.HashSet;

/**
 * @author zx
 * @version 1.0
 * @description:
* 求一个字符串"aiodjl;hriWFUADJSVUEHiowfjnivowe"中一共有几个不重复的字母,区分大小写,如a,A算两个字符
* 
* 	分析：
* 		将字符串拆分成一个个单个字符
* 		判断字符是否为字母
* 		如果是字母,放到一个HashSet集合中
* 		查看集合长度
 */
public class Demo07 {

	public static void main(String[] args) {
		String str = "aiodjl;hriWFUADJSVUEHiowfjnivowe";
		HashSet<Character> hashSet = new HashSet<>();
		char[] chs = str.toCharArray();
		for (char ch : chs) {
			//判断是否是字母
			if( (ch>='a' && ch <= 'z') || (ch>='A' && ch <= 'Z')  ) {
				hashSet.add(ch);
			}
		}
		System.out.println(hashSet.size());
	}
}
