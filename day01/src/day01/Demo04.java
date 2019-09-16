package day01;

/**
 * @author zx
 * @date 上午9:36:34
 * @version 1.0
 * @description:byte,short,int,long,float,double,char,boolean
 */
public class Demo04 {

	public static void main(String[] args) {
		//Type mismatch: cannot convert from int to byte
		byte b = 127;
		System.out.println(b);
		short s = 100;
		System.out.println(s);
		int i = 999;
		System.out.println(i);
		long l = 1000000000000000L;
		System.out.println(l);
		//Type mismatch: cannot convert from double to float
		float f = 12.34F;
		System.out.println(f);
		double d = 13.6;
		System.out.println(d);
		char ch = 'a';
		System.out.println(ch);
		boolean flag = true;
		System.out.println(flag);
		
	}

}
