package day01;

/**
 * @author zx
 * @date 上午10:38:47
 * @version 1.0
 * @description:算术运算符
 */
public class Demo08 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println("**************************");
		//取整
		System.out.println(a/b);
		System.out.println("**************************");
		//取余
		System.out.println(a%b);
		//浮点数参与运算
		System.out.println(3/4.0);
		System.out.println("**************************");
		for (int i = 1 ; i < 10; i++) {
			if( i%2 == 0 ){
				System.out.println(i);
			}
		}

	}

}
