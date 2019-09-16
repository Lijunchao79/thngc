package com.igeek;

public class Student {
	/**  
	* @Fields id : 学号  
	*/  
	private String id;
	/**  
	* @Fields name : 姓名  
	*/  
	private String name;
	/**  
	* @Fields age : 年龄  
	*/  
	private String age;
	/**  
	* @Fields address : 居住地  
	*/  
	private String address;
	/**  
	* @Title: Student      
	*/
	public Student() {
	}
	/**  
	* @Title: Student  
	* @param id
	* @param name
	* @param age
	* @param address    
	*/
	public Student(String id, String name, String age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


}
