package day01;

/**
 * @author zx
 * @date 上午11:08:24
 * @version 1.0
 * @description:关系运算符
 * ==,!=,>,>=,<,<=
 * 关系运算符的结果都是boolean型，也就是要么是true，要么是false。
 * 关系运算符“==”不能误写成“=”。
 */
public class Demo12 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("-----------------");
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("-----------------");
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("-----------------");
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("-----------------");
		
	}

}
