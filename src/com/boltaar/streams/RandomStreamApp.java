package com.boltaar.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RandomStreamApp {

	public static void main(String[] args) {
		
		List<Integer> listaLiczb = new ArrayList<>();
		List<Integer> listaLiczb2 = new ArrayList<>();
		
		Random rand = new Random();
		
		for (int i=0; i<100; i++){
			listaLiczb.add(rand.nextInt(250));
		}
		
		
		Stream.generate(() -> rand.nextInt(100)).limit(20).filter(p -> p>50).forEach(p -> System.out.println(p));
		System.out.println("Suma: " + Stream.generate(() -> rand.nextInt(100)).limit(10).mapToInt(liczba -> liczba).sum());
		
		// listaLiczb.stream().limit(50).forEach(p -> rand.nextInt(200));
		System.out.println("****************************");
		
		/*
		 * Dla przyklady tutaj STREAM naszego ArrayLista - w ktorym mamy 200 losowych liczb od 1 do 100 - stream ma filter
		 * ktory wypisuje tylko te ktore sa < 50
		 */
		listaLiczb.stream().filter(p -> p<50).forEach(p -> System.out.println(p));
		
//		System.out.println("****************************");
//		Stream.generate(() -> rand.nextInt(100)).map(p -> listaLiczb2.add(p)).limit(50).forEach(p -> System.out.println("Liczba: " + p));
//		
//		for (Integer element:listaLiczb2){
//			System.out.println("Liczba: " + element);
//		}
		
		
	}
}
