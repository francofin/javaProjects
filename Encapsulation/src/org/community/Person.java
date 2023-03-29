package org.community;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		this.name="john";
		this.age =15;
		this.gender="male";
	}
	
	
	public Person(String name, int age, String gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}


	public boolean setAge(int age) {
		
		if(age >=0 && age <=120) {
			this.age = age;
			return true;
		}
		
		return false;
		
	}
	
	
	
}
