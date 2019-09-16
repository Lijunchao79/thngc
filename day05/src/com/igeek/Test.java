package com.igeek;

public class Test {

	public static void main(String[] args) {
		
		try (Demo21 demo21 = new Demo21();){
			demo21.print();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
