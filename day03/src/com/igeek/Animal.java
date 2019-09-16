package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * 如果你不提供构造方法，系统会给出默认构造方法 
 * 如果你提供了构造方法，系统将不再提供 
 * 构造方法也是可以重载的 
 * - 成员变量 
	- 构造方法 
	无参构造方法 
	带参构造方法 
	- 成员方法 
	getXxx()
	setXxx()
 */
public class Animal {
	private int id;
	private String color;
	private String type;
	private String name;
	
	public Animal() {
		super();
	}
	public Animal(int id, String color, String type, String name) {
		super();
		this.id = id;
		this.color = color;
		this.type = type;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	
	//就近原则
	public void setName(String name) {
		this.name = name;
	}
	
	

}
