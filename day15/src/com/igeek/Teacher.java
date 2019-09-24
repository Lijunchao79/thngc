package com.igeek;

public class Teacher {
	
	private int id;
	private String name;
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}	

}
