package day01;

/**
 * @author zx
 * @date 上午9:44:28
 * @version 1.0
 * @description:
 *  •变量未赋值,不能直接使用
	–引出变量的第二种使用格式
	•变量只在它所属的范围内有效
	–变量在哪对大括号内，变量就属于哪对大括号
	•一行上可以定义多个变量，但是不建议
 */
public class Demo05 {
	
	public static void main(String[] args) {
		int a = 0 ;
		System.out.println(a);
		
		{
			int b = 10;
			System.out.println(b);
		}
		
//		System.out.println(b);
		int aa=10,bb=12,cc=45;
		
	}

}

