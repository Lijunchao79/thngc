package com.igeek;

public class Season {
	
	private final String name;
	
	private Season(String name) {
		this.name = name;
	}
	
	public static final Season SPRING = new Season("春天");
	public static final Season SUMMER = new Season("夏天");
	public static final Season AUTUMN = new Season("秋日");
	public static final Season WINTER = new Season("冬日");

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Season [name=" + name + "]";
	}
	

}
