package day01;

/**
 * @author zx
 * @date 上午10:50:32
 * @version 1.0
 * @description:
 *  整数的加法。
* 字符参与加法操作。拿字符在计算机中底层存储对应的数据值来参与运算的。
* 		'0'		48
* 		'a'		97
* 		'A'		65
* 字符串参与加法操作。
* 		这里的+其实不是加法，而是字符串连接符。
*/
public class Demo09 {

	public static void main(String[] args) {
		char c1 = '0';
		char c2 = 'a';
		
		int a = 10;
		int b = 20;
		
		System.out.println((int)c2);
		
		System.out.println(c1+c2);
		System.out.println(c1+a);
		//拼接
		System.out.println("helloworld"+a);
		System.out.println("helloworld"+a+b);
		System.out.println(a+b+"helloworld");

	}

}
