package day01;
//引入包
import java.util.Scanner;

/**
 * @author zx
 * @date 下午4:10:53
 * @version 1.0
 * @description:键盘录入
 */
public class Demo17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个参数:");
		int i = scanner.nextInt();
		System.out.println("请输入第二个参数:");
		int j = scanner.nextInt();
		System.out.println(i==j);
	}

}
