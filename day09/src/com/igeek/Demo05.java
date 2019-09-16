package com.igeek;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zx
 * @version 1.0
 * @descroption:正则表达式语法 
 * 1.普通字符（字母，数字，下划线），没有特殊含义的字符 
 * 2.转义字符 \t \n \\ ...... 
 * 3.\d :代表任意一个数字；0-9 
 * 4.\w :代表任意一个 字母 [a-zA-Z]，数字 [0-9]，_(下划线)
 * 5.\D :代表除了\d之外的 
 * 6.\W :代表除了\w之外的 
 * 7.\s :制表符，空格，换行符等中的任意一个
 * 8.\S :代表除了\s之外的 
 * 9. .(实心点) :匹配到任意的一个字符
 * 10.方括号[]:能够匹配方括号之中的任意一个字符 
 * 11.[^开头]:匹配方括号之外的任意一个字符
 * 12.[a-z]:某个范围之内的字符 量词 
 * 13.{n}:表达式重复出现的次数
 * 14.{m,n}:至少出现m次，不超过n次 
 * 15.{m,} 
 * 16. ? :匹配0次或一次; {0,1} 
 * 17. + :匹配至少出现1次; {1,} 
 * 18. * :任意次;{0,}
 * 19.^ :匹配开始的位置 
 * 20.$ :匹配结束的位置
 * 21.\b:边界匹配器：左右两边需要的是非\w
 * 22. | :左右两边或的关系
 * 
 * 需求： 
 * 1.电话号码
 *  1.1: 数字和-组成 
 *  1.2: 固话:7位或者8位 
 *  1.3: 区号:三位或者4位；首位0开头 
 *  1.4: 固话 区号-号码 
 *  1.5: 手机号码：11位 
 *  1.6: 手机号码 13,15,17开头 
 *  (0\d{2,3}-\d{7,8})|1[3578]\d{9}
 * 
 * 2.电子邮箱 (2aasae_as-Ad@qq163.com) 
 * 2.1 用户名：字母、数字、下划线, 中划线组成
 * 2.2 @ 
 * 2.3 网址 字母，数字组成 
 * 2.4 . 
 * 2.5 域名 com,cn,gov.edu......
 * [\w\-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,3}
 * 
 */
public class Demo05 {

	public static void main(String[] args) {

		// 表达式对象
		Pattern p = Pattern.compile("\\w+");

		// Matcher对象
		Matcher matcher = p.matcher("asfagfagga453_");

		boolean flag = matcher.matches();

		System.out.println(flag);
		
		System.out.println("***********************************");
		
		// 验证电话号码
		// 准备被匹配的字符串
		String phoneNumber = "12546546587";

		// 准备规则字符串
		String regex = "1[34578][0-9]{9}";
		// 正则匹配,返回结果
		boolean matches = phoneNumber.matches(regex);
		System.out.println(phoneNumber + "是否为电话号码:" + matches);
		
		String phoneNumber2 = "1aa2bb5";
		String[] strings = phoneNumber2.split("[a-z]{2}");
		System.out.println(Arrays.toString(strings));
		
		
		System.out.println("***********************************");
		//替换
		Pattern pattern = Pattern.compile("[0-9]");
		
		Matcher matcher2 = pattern.matcher("a2134214bb34455as111");
		
		String str = matcher2.replaceAll("#");
		System.out.println(str);
		

	}

}
