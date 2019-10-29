package HomeWork3;

import java.util.Date;

public class Student extends  People implements Comparable<Student> {
	
	private String nameOfUniversity;
	private String faculty;
	private int course;
	private String group;
	
	public  Student(  String name , String lastName , String surName ,int age, String nameOfUniversity,String faculty,int course,String group) {
	
		super(name,lastName,surName,age);
		this.nameOfUniversity=nameOfUniversity;
		this.faculty=faculty;
		this.course=course;
		this.group=group;
	}
	/*
	public Student() {
		super("anonim", "anonim", "anonim", 0);
	
	this.nameOfUniversity = "university";
	this.faculty="faculty";
	this.course=0;
	this.group="";
		
	}*/
	
	public void setNameOfUniversity(String nameOfUniversity) {
		this.nameOfUniversity = nameOfUniversity;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getNameOfUniversity() {
		return nameOfUniversity;
	}
	public String getFaculty() {
		return faculty;
	}
	public int getCourse() {
		return course;
	}
	public String getGroup() {
		return group;
	}
	


	@Override
	public String toString() {
		
		
		String information;
		information= super.toString() + "\nUniversity : " + this.getNameOfUniversity() + " \n faculty " + this.getFaculty() + "\n courses: " + this.getCourse() + "\n group: " + this.getGroup();;
		
		
return information;

	
	}

	@Override
	public int compareTo(Student o) {
		
		if(o==null) {
			return -1;
		}
		if(this.getAge()>o.getAge()) {
			return 1;
		}else if(this.getAge()<o.getAge()) {
			return -1;
		}else return 0;
		
	}
	
	

}
