package com.igeek;

import java.util.Scanner;

/**
 * @author Administrator
 *键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
 * 90-100	优秀
 * 80-90	好
 * 70-80	良
 * 60-70	及格
 * 60以下	不及格
 */
public class Demo03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩:");
		int score = scanner.nextInt();
		
		if(score>=90 && score<=100) {
			System.out.println("优秀");
		}else if (score>=80 && score<=89) {
			System.out.println("好");
		}else if (score>=70 && score<=79) {
			System.out.println("良");
		}else if (score>=60 && score<=69) {
			System.out.println("及格");
		}else if (score<60) {
			System.out.println("不及格");
		}
		
	}

}