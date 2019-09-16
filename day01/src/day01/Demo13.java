package day01;

/**
 * @author zx
 * @date 上午11:12:33
 * @version 1.0
 * @description:逻辑运算符概述
 * &,|,^,! 	&&,|| 
 * 异或：相同为假；不同为真
 */
public class Demo13 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println((a > b) & (a > c));// false & false
		System.out.println((a < b) & (a > c)); // true & false
		System.out.println((a > b) & (a < c)); // false & true
		System.out.println((a < b) & (a < c)); // true & true
		System.out.println("---------------");
		
		System.out.println((a > b) | (a > c));// false | false
		System.out.println((a < b) | (a > c)); // true | false
		System.out.println((a > b) | (a < c)); // false | true
		System.out.println((a < b) | (a < c)); // true | true
		System.out.println("---------------");
		System.out.println("异或");
		System.out.println((a > b) ^ (a > c));// false ^ false
		System.out.println((a < b) ^ (a > c)); // true ^ false
		System.out.println((a > b) ^ (a < c)); // false ^ true
		System.out.println((a < b) ^ (a < c)); // true ^ true
		System.out.println("---------------");
		System.out.println((a > b));//false
		System.out.println(!(a > b));//false
		System.out.println(!!(a > b));//false
	}

}
