package com.igeek;

//权限修饰符
public class Phone {
	
	//被private修饰的成员只在本类中才能访问。
	private String brand;
	double price;
	String color;
	String op;
	
	//局部变量
	private void call(String name){
		int a = 0;
		System.out.println("给"+name+"打电话");
		System.out.println(a);
	}
	
	public void sendMessage(){
		System.out.println("群发短信");
	}
	
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.brand = "HUAWEI";
		
		Phone phone2 = new Phone();
		phone.brand = "apple";
		
		Phone phone3 = new Phone();
		phone.brand = "VIVO";
	}
	
	

}
