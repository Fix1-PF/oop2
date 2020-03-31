package oop8;

public class Employee extends Person {

	private String dept;
	private String position;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, String email, String dept, String position, int salary) {
		super(name, email); 			//super() 메소드는 메소드의 첫번째 수행문으로만 사용할 수 있다.
		
		this.dept = dept;
		this.position = position;
		this.salary = salary;
		
	}
}
