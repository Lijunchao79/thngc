package day01;

/**
 * @author zx
 * @date 下午4:04:31
 * @version 1.0
 * @description:获取三个数中的最大值
 */
public class Demo16 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		
		int max = a > b ? a:b;
		max = max >c ? max :c;
		System.out.println(max);
		

	}

}
