package oop8;

public class Person {

	private String name;
	private String email;
	
	public Person() {}
	
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
	}
}
