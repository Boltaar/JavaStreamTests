package com.boltaar.comparatortest;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Alpha {

	public static void main(String[] args) {

		/*
		 * Nasz przyklad - mamy ArrayListe ze Stringami - i chcemy je teraz
		 * przekonwertowac na CAPITAL LETTERS WSZYSTKIE Mozna po staremu - czyli
		 * iteratorem jechac i .toUpperCase() Albo mozna Lambda
		 */
		List<String> lista = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot");

		// TEST NA CZYSTO
		lista.forEach(p -> System.out.println(p));

		// ITERATOR METHOD - musimy uzyc SubInterface ListIterator<T> extends Iterator<T>
		ListIterator<String> iter = lista.listIterator();
		while (iter.hasNext()) {
			iter.set(iter.next().toUpperCase());
		}

		System.out.println("PO ZMIANE ZA POMOCA ITERATORA");
		lista.forEach(p -> System.out.println(p));
		
		// ALBO Monza bylo prosciej za pomoca Lambda i nowego API
		System.out.println("*** ZNOWU MALE ZA POMOCA NOWEGO API I LAMBDY");
		lista.replaceAll(p -> p.toLowerCase());
		lista.forEach(p -> System.out.println(p));
	}
}
