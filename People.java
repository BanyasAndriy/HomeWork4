package HomeWork3;

public class People {

	private String name;
	private String lastName;
	private String surName;
	private int age;
	
	
	
	public People(String name, String lastName, String surName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.surName = surName;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
	
		String rez =this.getName() + " " + this.getLastName() + " "+ this.getSurName() + " " + this.getAge() + " років!";
		return rez;
	}
	
}
