package com.boltaar.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
Just a random comment - added from GIT HUB
Now added additonal comment - from GIT BASH this time
*/
public class Stream1 {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Zenek", 53));
		people.add(new Person("Pawel", 29));
		people.add(new Person("Mrek", 24));
		people.add(new Person("Adam", 23));
		people.add(new Person("Karol", 15));
		people.add(new Person("Asia", 14));
		people.add(new Person("Basia", 30));
		people.add(new Person("Kasia", 31));
		people.add(new Person("Hania", 23));
		
		for (Person element:people){
			System.out.println(element);
		}
		
		System.out.println("***********");
		// people.stream().forEach(System.out::println); -> BEZ LIMITU
		people.stream().limit(4).forEach(System.out::println);
		people.stream().limit(4).forEach(p -> System.out.println(p));
		System.out.println(people.stream().count());
		System.out.println("Less than 30 : " + people.stream().filter(p -> p.getAge() < 30).count());
		
		System.out.println("***********");
		int[] num = {0};
		int wiek = 18;
		Stream.generate(() -> new Person("Person " + num[0]++, wiek)).limit(20).forEach(System.out::println);
		
	}
}
