package com.igeek;

public class Person implements ISwim{
	
	private String pid;
	private String username;
	private String password;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
