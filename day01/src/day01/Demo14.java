package day01;

/**
 * @author zx
 * @date 上午11:20:19
 * @version 1.0
 * @description:&& || 短路效果
 */
public class Demo14 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println((a > b) && (a > c));// false && false
		System.out.println((a < b) && (a > c)); // true && false
		System.out.println((a > b) && (a < c)); // false && true
		System.out.println((a < b) && (a < c)); // true && true
		System.out.println("---------------");
		System.out.println((a > b) || (a > c));// false || false
		System.out.println((a < b) || (a > c)); // true || false
		System.out.println((a > b) || (a < c)); // false || true
		System.out.println((a < b) || (a < c)); // true || true
		System.out.println("---------------");

		int x = 3;
		int y = 4;
		//短路效果  &&   ||
		//System.out.println((x++ > 4) & (y++ > 5)); // false & false
		System.out.println((x++ > 4) && (y++ > 5)); // false && false
		System.out.println("x:" + x);
		System.out.println("y:" + y);

	}

}
