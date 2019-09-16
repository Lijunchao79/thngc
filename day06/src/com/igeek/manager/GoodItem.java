package com.igeek.manager;

public class GoodItem {
	
	//成员变量
	private String name;
	private String id;
	private double price;
	private int number;
	private String unit;
	private double money;
	public GoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodItem(String name, String id, double price, int number, String unit, double money) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.number = number;
		this.unit = unit;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

}
