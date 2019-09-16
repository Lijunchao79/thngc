package day01;

/**
 * @author zx
 * @date 下午4:00:33
 * @version 1.0
 * @description:三元运算符 (关系表达式) ? 表达式1 ：表达式2；
 */
public class Demo15 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int c = a>b ? a : b;
		System.out.println(c);
		
		boolean flag = a<b ? true : false;
		System.out.println(flag);
		
		System.out.println(a==b);

	}

}
