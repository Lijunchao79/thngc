package exercise;

import java.util.ArrayList;

public class ClassRoom {
	
	private String className;
	private ArrayList<Student> studentList;
	public ClassRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassRoom(String className, ArrayList<Student> studentList) {
		super();
		this.className = className;
		this.studentList = studentList;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "ClassRoom [className=" + className + ", studentList=" + studentList + "]";
	}

}
