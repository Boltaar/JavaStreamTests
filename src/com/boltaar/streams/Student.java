package com.boltaar.streams;

public class Student {

	private String name;
	private int index;
	private int age;

	public Student(String name, int index, int age) {
		super();
		this.name = name;
		this.index = index;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", index=" + index + ", age=" + age + "]";
	}

}
