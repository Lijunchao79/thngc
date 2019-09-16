package com.igeek;

public class NestedClass02 {
	
	private String name = "Jack";
	
	public void outerMethod() {
		//局部内部类
		class InnerClass {
			
			public void innerMethod() {
				System.out.println("innerMethod被访问了");
				System.out.println("外部类的成员变量name的值为:"+name);
			}
		}
		
		InnerClass innerClass = new InnerClass();
		innerClass.innerMethod();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
