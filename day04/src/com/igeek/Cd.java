package com.igeek;

public class Cd extends Item{
	//成员属性
	private String artist;
	
	//构造方法
	public Cd(String name, String artist) {
		super(name);
		this.artist = artist;
	}
	//setter and getter
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	//成员方法
	@Override
	public void print() {
		System.out.println(getName()+";"+artist);
	}

}
