package com.boltaar.comparatortest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {

	public static void sayMyName(Studenciak p){
		System.out.println("my name is: " + p.getFirstName());
	}
	
	public static void main(String[] args) {
		
		Studenciak s1 = new Studenciak("Adam", "Nikczemny", 25);
		Studenciak s4 = new Studenciak("Rafal", "Paszczak", 15);
		Studenciak s2 = new Studenciak("Adam", "Zbojnik", 24);
		Studenciak s3 = new Studenciak("Pawel", "Sokolski", 34);
		Studenciak s5 = new Studenciak("Rafal", "Boczek", 30);
		Studenciak s6 = new Studenciak("Witold", "Pierdola", 31);
		Studenciak s7 = new Studenciak("Zenek", "Paszczak", 20);
		Studenciak s8 = new Studenciak("Ignacy", "Boczus", 17);
		Studenciak s9 = new Studenciak("Donald", "Paszczak", 31);
		Studenciak s10 = new Studenciak("Lukasz", "Boczus", 25);
		
		
		List<Studenciak> listaStudentow = new ArrayList<>();
		listaStudentow.add(s1);
		listaStudentow.add(s2);
		listaStudentow.add(s3);
		listaStudentow.add(s4);
		listaStudentow.add(s5);
		listaStudentow.add(s6);
		listaStudentow.add(s7);
		listaStudentow.add(s8);
		listaStudentow.add(s9);
		listaStudentow.add(s10);
		
		
		/*
		 * Mozna na przyklad takiego polecenia uzyc - jest to swego rodzaju skrot na For EAch petly
		 * for (Studenciak element:listaStudentow){
		 * 		sysout(element)}
		 * 
		 * To robimy LIST.forEach(element -> co z nim zrobic)
		 * Mozna jeszcze skrocic to i zrobic LIST.forEach(System.out::println)
		 */
		listaStudentow.forEach(p -> System.out.println(p));
		System.out.println("**** PONIZEJ POSORTOWANE ZA POMOCA WIEKU****");
		
		/* Ponizej posortujemy jeszcze dodatkowo po wieku
		 * 
		 * 
		 */
		listaStudentow.sort((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
		listaStudentow.forEach(System.out::println);
		System.out.println("********");
		
		/*
		 * Tutaj jeszcze przyklad jednego nowego wyrazenia
		 */
		listaStudentow.forEach(p -> sayMyName(p));
		System.out.println("********");
		
		/*
		 * Nowa Metoda - List.removeIf(Predicate) - usuwa od razu cos
		 * List.removeIf(p -> p.getName().equals("Zenek Saper");
		 * 
		 * Usunie kazdego Zenka Sapera z naszej listy
		 */
		listaStudentow.removeIf(p -> p.getLastName().equals("Sokolski"));
		listaStudentow.forEach(p -> System.out.println(p));
		System.out.println("********");
		listaStudentow.stream().filter(p -> p.getAge()>20).forEach(System.out::println);
		
		/*
		 * Mozna tak w 1 linijce posortowac teraz na przyklad - kiedys trzeba bylo iteratorem w iteratorze to ribc
		 * I bylo to duzo bardziej skomplikowane lista.sort(COMPARATOR.COMPARTING(lambda).THENCOMPARING(lambda))
		 */
		System.out.println("---> TERAZ SORT COMPARATOR.COMPARING METODA - najpierw LAST NAME potem AGE <---");
		listaStudentow.sort(Comparator.comparing((Studenciak p) -> p.getLastName()).thenComparing((Studenciak p) -> p.getAge()));
		// Mozna tez krocej uzywaja method references - PONIZEJ - zamiast Lambdy tylko TYPE::METHOD dajemy w nawiasach tam gdzie trzeba
		// listaStudentow.sort(Comparator.comparing(Studenciak::getFirstName).thenComparing(Studenciak::getAge));
		listaStudentow.forEach(p -> System.out.println(p));
		
		
	}
}
