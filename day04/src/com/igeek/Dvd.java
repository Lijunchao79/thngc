package com.igeek;

public class Dvd extends Item{
	//成员属性
	String director;
	
	//构造方法
	public Dvd(String name, String director) {
		super(name);
		this.director = director;
	}
	//setter and getter
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	//成员方法
	@Override
	public void print() {
		System.out.println(getName()+";"+director);
	}
	
	

}
