package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 *  public static int abs(int a)：返回a的绝对值
	public static double ceil(double a) ：求大于等于a的最小整数,返回该整数的小数形式
	public static double floor(double a) ：求小于等于a的最小整数
	public static long round(double a) ：对a进行四舍五入,返回四舍五入后的值
	public static double pow(double a, double b) ：求a的b次幂,返回double形式
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		System.out.println(Math.abs(-12));
		System.out.println(Math.round(4.4));
		System.out.println(Math.round(4.5));
		//取整
		System.out.println(Math.ceil(4.5));
		System.out.println(Math.floor(4.5));
		System.out.println(Math.pow(2, 3));
		
	}

}
