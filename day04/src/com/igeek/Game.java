package com.igeek;

public class Game extends Item {

	String platform;

	public Game(String name, String platform) {
		super(name);
		this.platform = platform;
	}

	@Override
	public void print() {
		System.out.println(platform + ";" + getName());
	}

}
