package com.boltaar.streams;

import java.util.ArrayList;
import java.util.List;

public class StudentAppStream {

	public static void main(String[] args) {
		
		Student s1 = new Student("Zenek Saper", 71939, 23);
		Student s2 = new Student("Alfred Rex", 69166, 33);
		Student s3 = new Student("Kaczor Pisdzielec", 10384, 44);
		Student s4 = new Student("Andrzej Dupa", 98276, 17);
		Student s5 = new Student("Donald Tusk", 98673, 78);
		Student s6 = new Student("Boby Carter", 221349, 101);
		Student s7 = new Student("Melanie Smith", 11139, 22);
		Student s8 = new Student("Ben Layton", 54339, 9);
		Student s9 = new Student("Adam Nikczemny", 41339, 41);
		
		List<Student> lista1 = new ArrayList<>();
		lista1.add(s1);
		lista1.add(s2);
		lista1.add(s3);
		lista1.add(s4);
		lista1.add(s5);
		lista1.add(s6);
		lista1.add(s7);
		lista1.add(s8);
		lista1.add(s9);
		
		for (Student element:lista1){
			System.out.println(element);
		}
		
		System.out.println("TERAZ PONIZEJ ZE STREAMEM");
		
		// lista1.forEach(System.out::println); -> MOZNA W TEN SPOSOB WYDRUKOWAC - METHOD REFERENCES
		
		lista1.stream().filter((stud) -> stud.getAge()>50).forEach(System.out::println);
		System.out.println("*****************");
		lista1.stream().filter((stud) -> stud.getName().startsWith("A")).forEach(System.out::println);
		System.out.println("*****************");
		lista1.stream().filter((stud) -> stud.getName().startsWith("A")).filter((stud) -> stud.getAge()<20).forEach(System.out::println);
		System.out.println("*****************");
		Student[] arr1 = lista1.stream().filter((p) -> p.getAge()>30).toArray(Student[]::new);
		
		for (Student element:arr1){
			System.out.println(element);
		}
		
		
	}
}
