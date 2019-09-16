package day01;

/**
 * @author zx
 * @date 上午9:59:28
 * @version 1.0
 * @description:隐式数据类型转换
 * 取值范围小的数据类型与取值范围大的数据类型进行运算,会先将小的数据类型提升为大的,再运算
 */
public class Demo06 {

	public static void main(String[] args) {
		System.out.println(1+2);
		
		int a = 2;
		int b = 3;
		int c = a+b;
		System.out.println(c);
		
		byte bb = 2;
		int d =4;
		short ff = 55;
		//Type mismatch: cannot convert from int to byte
		int ee = bb+d;
		int gg = ff+d;
		System.out.println(ee);
		System.out.println("***********************");
		char ch = 'a';
		char chA = 'A';
		int cha = ch;
		int chAA = chA;
		System.out.println(ch);
		System.out.println(chA);
		System.out.println(cha);
		System.out.println(chAA);

	}

}
