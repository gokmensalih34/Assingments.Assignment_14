package Assingments.Assignment_14.Question04_Person;

public class Person {
		
	private String firstName;
	private String lastName;
	private int age;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return  firstName+ "|" + lastName + "|" + age;
	}
	
	
	public Person() {
		this.firstName = "undefined";
		this.lastName  = "undefined";
		this.age = -1;
		
	}
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

}
