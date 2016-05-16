package com.boltaar.comparatortest;

public class Studenciak {

	private String firstName;
	private String lastName;
	private Integer age;

	public Studenciak(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Studenciak [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
