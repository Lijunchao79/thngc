package com.igeek;

import java.io.IOException;

//让调用者去处理异常
public class Demo09 {

	public static void main(String[] args) throws IOException {
		Demo09 demo09 = new Demo09();
		demo09.methods();
		System.out.println("hi");
	}
	
	public void methods(){
		try {
			method();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void method() throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException,IOException,Exception {
		
		System.out.println(10/0);
	}

}
