package com.igeek;

public class Item {
	// 成员属性
	private String name;
	private int palyingTime;
	private String content;

	// 构造方法
	public Item(String name) {
		super();
		this.name = name;
	}

	// setter and getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPalyingTime() {
		return palyingTime;
	}

	public void setPalyingTime(int palyingTime) {
		this.palyingTime = palyingTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	// 成员方法
	public void print() {
		System.out.println("item print.......");
	}

}
