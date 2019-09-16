package com.igeek;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @version 1.0
 * @descroption:
 * try{
		需要检测的异常；
	} catch(异常类名异常变量) {
		异常处理代码
		可以调用异常的方法
		通常我们只使用一个方法：printStackTrace打印异常信息
	} finally{
		此处存放一定要执行的代码
		一般把释放资源的代码放到finally中
	}
 */
public class Demo13 {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("a.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("资源释放");
		}
		
		
	}

}
