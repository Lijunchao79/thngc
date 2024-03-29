package com.igeek;

public class Student extends Person {
	
	private int id;
	public Student() {
	}
	
	public Student(int id,String name,int age) {
		super(name,id);
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void study() {
		System.out.println("学习");
	}
	
	//重写
	@Override
	public void eat() {
		System.out.println("eat bread");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
