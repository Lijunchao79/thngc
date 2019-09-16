package day01;

/**
 * @author zx
 * @date 上午10:13:01
 * @version 1.0
 * @description: 
 * 强制转换的格式 b = (byte)(a + b); 
 * ctrl+shift+f:格式化代码
 */
public class Demo07 {

	public static void main(String[] args) {
		byte a = 2;
		int b = 4;
		// 如果超出了被赋值的数据类型的取值范围得到的结果会与你期望的结果不同
		byte c = (byte) (a + b);
		System.out.println(c);
	}

}
